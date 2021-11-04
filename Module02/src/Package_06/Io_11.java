package Package_06;

import java.io.*;

/*字符流复制文件*/
/*FileReader和FileWriter分别是 InputStreamReader和OutputStreamWriter的子类对象，使用方法和作用一样，但是不能编码，默认使用UFT-8*/
public class Io_11 {
    public static void main(String[] args) throws IOException {
       // InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\steam\\Io_10.java"),"UTF-8");
        FileReader isr = new FileReader("D:\\steam\\Io_10.java");//两者比较：可以直接写地址，但没了编码能力

        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Module02\\Copy.java"));
        FileWriter osw = new FileWriter(("Module02\\Copy.java"));
        char[] chs = new char[1024];
        int len;
        while ((len=isr.read(chs))!=-1){
            osw.write(chs);
        }



        isr.close();
        osw.close();
    }
}
