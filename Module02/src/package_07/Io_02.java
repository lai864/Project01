package package_07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*打印流
*   字节打印流：PrintStream//与字节输入流的区别，写入的数据不会转码
*   字符打印流：PrintWrite//与字符输入流的区别，不用手动刷新，文件输出流对象后加true实现自动刷新，不会转码
* 区别:改进了字符流复制文件和写入数据的刷新问题，字符流有缓存在内存，刷新写入的问题，默认编码的情况下，是改进了
*
*
* 打印流的特点
*   只负责输出数据，不负责读取数据
*   有自己特有的方法
*
* 字节打印流
*   PrintStream(Stream fileName):使用指定的文件名创建新的打印流
*   使用继承父类的方法写数据，查看的时候回转码；使用自己特有的方法写数据，查看的数据原样输出*/
public class Io_02 {
    public static void main(String[] args) throws IOException {
        java.io.PrintStream ps = new java.io.PrintStream("Module02\\打印.txt");

        //使用继承父类的方法写数据，查看的时候回转码
        ps.write(97);

        //使用自己特有的方法写数据，查看的数据原样输出
        ps.println(97);
        ps.println(65);


        ps.close();

        // 字符打印流：PrintWrite,能自动刷新
        PrintWriter pw = new PrintWriter(new FileWriter("Module02\\字符打印流.txt"),true);

        pw.println(97);
        pw.println("hello");
    }
}
