package Package_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*UDP通信练习
* UDP发送数据：  键盘录入，直到输入数据是886，发送结束
* UDP接收数据：不知道什么时候发送端停止，所以采用死循环*/
public class SendDemo {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket();

     /*   while (true) {
            System.out.println("请输入你要发送的数据");
            String line = sc.nextLine();

            if (line.equals("886")) {
                byte[] bytes = line.getBytes();
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.50.1"), 10086);

                ds.send(dp);
               break;
            }else {
                byte[] bytes = line.getBytes();
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.50.1"), 10086);

                ds.send(dp);
            }
        }

      */
        //不输出886
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line=br.readLine())!=null){
            if (line.equals("886")){
                break;
            }
            byte[] bytes = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.50.1"), 10086);

            ds.send(dp);

        }

        ds.close();
    }
}