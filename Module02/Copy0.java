package Package_06;
// 字节流和字符流读数据相似，都有两种方法，第一种输出要char(数组)，第二种方法要new String(数组，0，len)
//写数据很简单，osw.write(),不同的是字符流需要ows.flush()刷新,这是因为字符流使用了缓冲写入
//字节流写中文和英文也能完成，二进制也可以，都是 “数据”.getBytes方法 转换为数组。Io_07详解
//字符流写比字节流方便，中文或其他类型直接osw.write(“中国”)，而字节流一定要化为byte数组，再写入。
//字符流能直接写字符串，字符数组，字符串也是字符的一种
//字节流以字节写入数据，字符流以字符写入数组
//字节流更好，更广泛，文件和硬盘在传输时都是以字节方式传输，储存。字符只在内存中才形成，更适合跨平台文字
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*字符流读数据
* InputStreamReader​(InputStream in) 创建一个使用默认字符集的InputStreamReader。
*
* 读数据的两种方法：
*  void read():一次读一个字符数据
*  void read(char[] cbuf):一次读取一个字符数组数据*/
public class Io_10 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("Module02\\荷塘月色.txt"));
       //一次读一个字符
        int ch;
        while ((ch=isr.read())!=-1){
            System.out.print((char)ch);
        }

        //一次读一组
        char[] chars = new char[1024];
        int len;
        while ((len=isr.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }

        isr.close();
    }
}
