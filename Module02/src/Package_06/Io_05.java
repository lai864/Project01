package Package_06;

import java.io.*;

/*字节缓冲流
* 字节缓冲流：
*   BufferOutputStream:该类实现缓冲输出流。通过设置这样的输出流，应用程序可以向底层输出流写入字节，二不必
* 为写入的每个字节导致底层系统的调用
*
*   BufferedInputStream:创建BufferedInputStream将创建一个内部缓冲区数组。当从流中读取或跳过字节时，内部缓冲区将根据需要从所包含的输入流中重新填充，一次很多字节
*
* 构造方法：
*   字节缓冲输出流：BufferedOutputStream(OutputStream out)
*   字节缓冲输入流：BufferedInputStream(InputStream in)
*
* 为什么构造方法需要的是字节流，而不是具体的文件或者路径呢？
*   字节缓冲流仅仅提供缓冲区，而真正镀锌数据还得依靠基本的字节流对象进行操作*/
public class Io_05 {
    public static void main(String[] args) throws IOException {
       /* BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Module02\\bitch"));
         bos.write("hello\r\n".getBytes());
         bos.write("world\r\n".getBytes());

         bos.close();
        */

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Module02\\bitch"));
        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }
    }
}
