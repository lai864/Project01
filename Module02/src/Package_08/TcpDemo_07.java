package Package_08;

import java.io.*;
import java.net.Socket;

public class TcpDemo_07 {
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

        s.shutdownOutput();

        BufferedReader brServer = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brServer.readLine();
        System.out.println("服务器反馈:"+data);

        br.close();
        s.close();

    }
}
