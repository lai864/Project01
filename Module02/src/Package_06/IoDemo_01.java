package Package_06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*复制图片,*/
public class IoDemo_01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\steam\\th.jpg");

        FileOutputStream fos = new FileOutputStream("Module02\\th.jpg");

       /* int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }
        */

        //一次读一个字节数组，一次写一个字节数组
       byte[] bys = new byte[1024];
       int len;
       while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
       }

        fis.close();

        fos.close();
    }
}
