package Package_08;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpDemo_06 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Module02\\TCP_06练习.txt"));

        String line;
        while ((line=br.readLine())!=null){
            if ("886".equals(line)){
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw2.write("数据已接收，并写入文件");
        bw2.newLine();
        bw2.flush();

        ss.close();
        bw.close();

    }
}
