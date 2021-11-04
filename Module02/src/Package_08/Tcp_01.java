package Package_08;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*TCP发送数据
* 发送数据的步骤
*   创建客户端的Socket对象
*   Socket(String host,int port)
*   获取输出流，写数据
*   OutputStream getOutputStream()
*   释放资源
*   void close();*/
public class Tcp_01 {
    public static void main(String[] args) throws IOException {
        //Socket(String host, int port):创建一个流套接字，并将其与指定的主机上的指定端口号连接起来。
        Socket s = new Socket("192.168.50.1",10086);

        //OutputStream getOutputStream():返回此套接字的输出流。
        OutputStream os = s.getOutputStream();
        os.write( "Hello,你好，TCP".getBytes());

        s.close();

    }
}
