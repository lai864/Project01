package Package_08;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*客户端*/
public class TcpDemo_03 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.50.1", 10086);

        /*
        //键盘输入数据直到886，客户端发送数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));//字符输入输出流括号里是字节输入输出流，桥梁

        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }

//            OutputStream os = s.getOutputStream();
//            os.write(line.getBytes());
            bw.write(line);
            bw.newLine();
            bw.flush();


        }


        s.close();
        br.close();
        bw.close();

         */


        //默认是字节流方法，在写个读或写的字节流，指向地址，字节流也可以读写文件(字节流方法读文件)
       FileInputStream fis = new FileInputStream("Module02\\TCP_03练习.txt");
        //BufferedInputStream fis = new BufferedInputStream(new FileInputStream("Module02\\TCP_03练习.txt"));
        OutputStream os = s.getOutputStream();
        //BufferedOutputStream os = new BufferedOutputStream(s.getOutputStream());
        byte[] bytes= new byte[1024];
        int len;
        while ((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        fis.close();
        os.close();
        s.close();



        //客户端从文件发送数据（字符流方法）。
       /* BufferedReader br = new BufferedReader(new FileReader("Module02\\TCP_03练习.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));//都是字节流，编码字符流，缓冲字符流

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        s.close();
        br.close();
        bw.close();

        */
    }

}
