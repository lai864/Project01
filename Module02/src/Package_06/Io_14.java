package Package_06;

import java.io.*;

/*字符缓冲流特有功能改进版：复制JAVA文件*/
public class Io_14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\steam\\Io_10.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Module02\\Io_14.java"));




        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        br.close();
    }
}
