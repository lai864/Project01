package package_07;

import java.io.*;

/*复制JAVA文件（打印流改进版）*/
public class Io_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new FileReader("D:\\steam\\Io_10.java"));
        PrintWriter pw = new PrintWriter(new FileWriter("Module02\\打印流改进版.java"));

        String line;
        while ((line=bw.readLine())!=null){
            pw.println(line);
        }
        bw.close();
        pw.close();
    }
}
