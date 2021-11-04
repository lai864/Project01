package Package_06;
/*字符流写数据*/
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
void write​(int c) 写一个字符
void write(char[] cbuf):写一个字符数组
void write​(char[] cbuf, int off, int len) 写入字符数组的一部分。
void write (Stream str):写一个字符串
void write​(String str, int off, int len) 写一个字符串的一部分。
void flush():刷新流
*/
public class Io_09 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Module02\\fos"));
        osw.write("中国12");
        osw.write(121);
        //void flush():刷新流
        osw.flush();
        osw.write(97);


        //void write(char[] cbuf):写一个字符数组
       char[] ch = {'w','r','u'};
       osw.write(ch);
       //void write​(char[] cbuf, int off, int len) 写入字符数组的一部分
       osw.write(ch,1,2);
       //void write (Stream str):写一个字符串
        osw.write("dfg");
        //void write​(String str, int off, int len) 写一个字符串的一部分。
        osw.write("abcd",0,2);//写前两个，不是索引
        osw.close();
    }
}
