package Package_06;
/*字符流
* 为什么会出现字符流
*   由于字节流操作中文不是特别的方便，所以Java就提供字符流
*   字符流=字节流+编码表、
*
* 用字节流文本文件时，文本文件也会有中文，但是没有问题，原因是最终底层操作会自动进行字节拼接成
* 中文，如何识别是中文呢？
*   汉字在储存时，无论选择哪种编码储存，第一个都是负数*/


import java.io.*;
import java.util.Arrays;

/*编码：
*   byte[] getBytes();使用平台默认字符集将该String编码为一系列字节，将结果储存到新的字节数组中
*   byte[] getBytes(String charsetName);使用指定字符集将该String编码为一系列字节，将结果储存到新的字节数组中
*
* 构造方法：
*   String(byte[] Bytes);使用平台默认字符集解码指定的字节数组来构造新的String
 *  String(byte[] Bytes String charsetName);使用指定字符集解码指定的字节数组来构造新的String*/
public class Io_07 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Module02\\write.txt");
        String s = "中国";
        //fos.write(s);
        //编码
        byte[] bytes = s.getBytes("UTF-8");//平台默认方法是UTF-8,还有GBK等方法
        System.out.println(Arrays.toString(bytes));
        fos.write(bytes);

        byte[] bytess = "hellow".getBytes("UTF-8");//平台默认方法是UTF-8,还有GBK等方法
        System.out.println(Arrays.toString(bytess));
        fos.write(bytess);


        //解码
        String ss = new String(bytes,"UTF-8");
        System.out.println(ss);
        fos.close();


    }
}
