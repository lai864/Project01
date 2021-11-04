package Package_08;
//Tcp文件读写发送结束，并服务器反馈
//public void shutdownOutput(),发送结束方法，才能得到服务器反馈
import java.io.*;
import java.net.Socket;

public class TcpDemo_05 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.50.1",10086);

        BufferedReader br = new BufferedReader(new FileReader("Module02\\Io_14.java"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //自定义发送结束标记
//        bw.write("886");
//        bw.newLine();
//        bw.flush();
        //public void shutdownOutput()
        s.shutdownOutput();

        BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data=br2.readLine();
        System.out.println("服务器的反馈:"+data);


        br.close();
        s.close();


    }
}
