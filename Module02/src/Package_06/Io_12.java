package Package_06;

import java.io.*;

/*字符缓冲流
* BufferedReader
* BufferedWriter*/
public class Io_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\steam\\Io_10.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Module02\\Copy_02.java"));

       /* int ch;
        while ((ch=br.read())!=-1){
            bw.write(ch);

        }
        */

        char[] chs = new char[1024];
        int len;
        while ((len=br.read(chs))!=-1){
            bw.write(chs);
        }

        br.close();
        bw.close();
    }
}
