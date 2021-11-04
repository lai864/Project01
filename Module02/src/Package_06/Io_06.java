package Package_06;

import java.io.*;

/*从D盘复制到本模块*/
public class Io_06 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\steam\\超市管理.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Module02\\超市管理.mp4"));

        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }

        bis.close();
        bos.close();
    }


}
