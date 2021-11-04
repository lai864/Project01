package Package_08;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpDemo_08 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        while (true) {
            Socket s = ss.accept();
            new Thread(new ServerThread(s)).start();
        }
    }
}
