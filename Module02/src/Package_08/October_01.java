package Package_08;


import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *网络编程：信息传递，资源共享
 * 网络编程三要素：ip地址，端口，协议
 */

/*ip地址：
*   两大类：ipv4,ipv6
* 常用命令：
*   ipconfig:查看本机ip地址
*   ping ip地址：检查网络是否连通
*
* 特殊ip地址
*   127,0,0,1：是回送地址，可以代表本机地址，一般用来测试使用
*
*
* InetAddress的使用
*   为了方便我们对Ip地址的获取和操作，Java提供了一个类InetAddress供我们使用
*
* InetAddress:此类表示internet协议（ip）地址
* 方法：
* static InetAddress getByName(String host) :确定主机的IP地址，给定主机名 ,主机名可以是机器名称，也可以是ip地址。
* String getHostName() :获取此IP地址的主机名。
* String getHostAddress() :返回文本表示中的IP地址字符串。

* 端口：
*     端口：设备上应用程序的唯一标识符
*   端口号，用两个字节表示，范围0-65535,0-1023,用于一些知名网络和服务，普通应用程序使用1024以上的端口，端口被占用，会导致当前程序启动失败，需要改变端口号
*
* 协议
* udp协议
*   用户数据报协议
*   udp是无连接通信协议，数据发送端和连接段不建立逻辑联系
*   资源消耗少，通信效率高，用于音频，视频的普通数据传输
* 重要数据不使用udp协议传输
*
*   tcp协议
* 传输控制协议
* Tcp协议是面向连接的通信协议，数据发送端和连接端建立逻辑联系
* 提供两台计算机无差错的数据传输
* 由客户端向服务器发出连接请求，每次连接创建都需要经过“三次握手”
* 第一次握手：客户端向服务器发出连接请求，等待服务器确认
* 第二次握手：服务器向客户端回送一个响应，通知客户端收到了连接请求
* 第三次握手：客户端再次向服务器发送确认信息，确认连接
*
*   完成三次握手，连接建立后客户端和服务器可以进行数据传输了，由于这种面向性的连接
*   TCP协议可以保证数据传输的安全性，所以应用十分广泛，列如，上传文件，下载文件，浏览网页等
*
*/
public class October_01 {
    public static void main(String[] args) throws UnknownHostException {
        //static InetAddress getByName(String host) :确定主机的IP地址，给定主机名 ,主机名可以是机器名称，也可以是ip地址。
        //InetAddress address = InetAddress.getByName("192.168.50.1");
        InetAddress address = InetAddress.getByName("WIN-MKIG21EIVSI");

        //String getHostName() :获取此IP地址的主机名
        String name = address.getHostName();

        // String getHostAddress() :返回文本表示中的IP地址字符串。
        String ip = address.getHostAddress();

        System.out.println(name);
        System.out.println(ip);
    }
}
