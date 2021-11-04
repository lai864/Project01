package Package_08;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*服务器*/
public class TcpDemo_04 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        Socket s = ss.accept();
        /*
       // 控制台输出客户端发送来的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));


        String line;

        while (true){
            while ((line=br.readLine())!=null){
                System.out.println("服务器:"+line);
            }



        }

         */
        //字节流方法，接收客户端数据写到文件，
        InputStream is = s.getInputStream();//写到文件和不写到文件都用这个getInputStream()方法读客户端发来的数据
        //BufferedInputStream is = new BufferedInputStream(s.getInputStream());
        FileOutputStream fos = new FileOutputStream("Module02\\\\TCP_04练习.txt");
       // BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("Module02\\\\TCP_04练习.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len=is.read(bytes))!=-1){  //要在括号里加写的字节，因为这里是一次读一个数组，读一位括号里不写
            fos.write(bytes,0,len);
        }
        fos.close();
        is.close();
        ss.close();


      /*  //将从客户端接收的数据写到文件（字符流方法写）
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Module02\\TCP_04练习.txt"));

        String line;

            while ((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
        bw.close();
            ss.close();

       */
    }
}
