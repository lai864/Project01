package Package_08;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*客户端*/
public class TcpDemo_01 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.50.1",10086);

        OutputStream os = s.getOutputStream();
        os.write("Hello,UDP,你好".getBytes());

        //接收服务器反馈
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("客户端:"+data);

        s.close();
    }
}
