package Package_08;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*UDP接收数据
*   接收数据的步骤
* 创建数据接收端的Socket对象（DatagramSocket）
* DatagramSocket(int port)
*
*创建一个数据包，用于接收数据
* DatagramPacket(byte[] buf,int length)
*
* 调用DatagramSocket对象的方法接收数据
*   void receive(DatagramSocket)
*
* 解析数据包，并把数据在控制台显示
*   byte[] getData()
*   int getLength()
*
* 关闭接收端
*   void close()
*
*   */
public class UDP_02 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds =  new DatagramSocket(10086);//ds端口

        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);//dp数据包

        ds.receive(dp);//端口接收数据包

//        byte[] data = dp.getData();
//        int length = dp.getLength();
//        String dataString = new String(data,length);
//        System.out.println("数据是："+dataString);
        //输出解析数据包后的数据
        System.out.println("数据是"+new String(dp.getData(),0,dp.getLength()));

        ds.close();
    }
}
