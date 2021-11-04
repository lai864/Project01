package Package_06;
/*io流概述和分类
* io流分类：
*   输入流：读数据
*   输出流：写数据
* 按照数据类型来分
*   字节流
*       字节输入流，字节输出流
*   字符流
*       字符输入流，字符输出流
*
* 一般来说，我们说io流的分类按照数据类型来分的
* 那么这两种流都在什么情况使用呢？
*   如果数据通过Windows自带的记事本打开，我们还可以读懂里面的内容，就使用字符流
* 否则使用字节流，如果你不知道该使用哪一种类型的流，就使用字节流*/


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*字节流写数据
* 字节流抽象基类
*   inputStream:这个抽象类表示字节输入流的所有类的超类
*   OutputStream:这个抽象类是表示字节流的所有类的超类
*   子类名特点，子类名称都是以父类名称作为子类名称的后缀
*
* 构造方法：
* FileOutputStream:二级输出流用于将数据写入File
*   FileOutputStream(String name):创建文件输出流一指定的名称写入文件
*
* 使用字节输出流写入数据的步骤：
*   创建输出流对象（调用系统功能创建了文件，创建字节输出流对象，让字节输出流对象指向文件）
* 调用字节输出流对象的写数据方法
* 释放资源（关闭此文件输出流并释放与此流相关联的任何系统资源）*/


/*字节流写数据的两个小问题
* 字节流写数据如何实现换行呢？
*   写完数据后，加换行符
*       windows:\r\n
*       linux:\n
*       mac:\r
*
* 字节流写数据如何实现追加写入呢？
*   public FileOutputStream(String,boolean,append)
*   创建文件输出流以指定的名称写入文件，如果第二个参数为true,则字节将写入文件的末尾而不是开头，在末尾从头到尾输入一遍，相当与重复写，不覆盖，要输入多份同样的数据时使用*/
public class io_01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Module02\\fosing.txt");

        fos.write(97);//这文件里写入数据，对照ASII表



        //void write (byte[] b);将b.length字节从指定的字节数组写入此文件输出流
        //byte[] getBytes():返回字符串对应的字节数组
        byte[] bytes = "中国".getBytes("UTF-8");
        fos.write(bytes);

        //void write (bytes[] b,int off,int len):将len字节从指定的字节数组开始，偏移量
        fos.write(bytes,1,3);


        for (int i=0;i<10;i++) {
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();//释放资源
    }
}
