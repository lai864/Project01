package Package_08;
//void receive(DatagramPacket p):接收数据报包从这个插座。
import java.io.IOException;
import java.net.*;

/*UDP通信原理
*   是一种不可靠的网络协议，它在通信两端建立一个Socket对象，但是这两个Socket只是发送，接收数据的对象
* 因此对于基于UDP协议的通信双方而言，没有所谓的客户端，服务器的概念
* Java提供了DatagramSocket类作为基于UDP协议的Socket
*
* UDP发送数据
* 发送数据的步骤
*   创建发送端的Socket对象（DatagramSocket）
*   创建数据，并把数据打包
*   调用DatagramSocket对象的方法发送数据
*   关闭发送端*/
public class UDP_01 {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象（DatagramSocket）
        //DatagramSocket():构建一个数据报套接字绑定到本地主机的任何可用的端口。
        DatagramSocket ds = new DatagramSocket();

        //创建数据，并把数据打包
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //构建一个数据包， 指定主机上的指定端口发送数据包的长度 length数据报包结构。
        byte[] bytes = "Hello,UDP,我来了".getBytes();
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.50.1"),10086);

        // 调用DatagramSocket对象的方法发送数据
        //void send(DatagramPacket p):从这个套接字发送数据报包
        ds.send(dp);
        //关闭发送端
        //void close():关闭该数据报套接字。
        ds.close();


    }
}
