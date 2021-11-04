package Package_06;

import java.io.FileInputStream;
import java.io.IOException;

/*Io流输入，读数据（一次读一个字节数组数据）
 *
 * 此程序读String,输字符串型 Io_2程序char读出字符型
 *
 * */
public class Io_04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Module02\\荷塘月色.txt");

        byte[] bys = new byte[2048];
        int len;
        while ((len = fis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));//这这里最后添加数组长度0到len，因为有的文件在输出数据，也就是写入数据时会做fos.write(\n\r)来换行，如果不添加数组长度就会输出\n\\r

            /* System.out.println(new String(bys, 0, len));

            read(byte[] b, int off, int len)
        读到 len从输入流到字节数组数据字节。


            public int read(byte[] b,
                int off,
                int len)
         throws IOException
        读到 len字节从输入流到字节数组数据。如果 len不为零，该方法阻塞直到输入可用；否则，没有字节读取和 0返回。
        重写：
        read 方法重写，继承类  InputStream
        参数
        b -缓冲区中读取数据。
        off -开始抵消目标数组 b
        len -的最大字节数读。
        结果
        读入缓冲的字节总数，或 -1如果没有更多的数据，因为已经到达文件末尾。*/
        }

        fis.close();
    }
}
