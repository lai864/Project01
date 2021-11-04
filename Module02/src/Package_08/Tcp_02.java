package Package_08;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*TCP接收数据
*   TCP接收数据的步骤
*   创建服务器端的Socket对象（ServerSocket）
*       ServerSocket(int port)
*   监听客户端连接，返回一个Socket对象
*       Socket accept()
*   获取输入流，读数据，并把数据显示在控制台
*       InputDStream getInputStream()
*   释放资源
*   void close()*/
public class Tcp_02 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        Socket s = ss.accept();
        InputStream is = s.getInputStream();

        byte[] bys= new byte[1024];
        int len;
        while ((len=is.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }

        ss.close();
        s.close();
    }
}
