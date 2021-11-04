package Package_06;

import java.io.*;

/*try...catch...finally JDK7改进版*/
public class Io_23 {
    public static void main(String[] args) {

    }
    //try(){}...catch{}
    public static void method(){
       try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\steam\\超市管理.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Module02\\超市管理.mp4"))) {

           byte[] bys = new byte[1024];
           int len;
           while ((len = bis.read(bys)) != -1) {
               bos.write(bys, 0, len);
           }
       }catch (IOException e){
           e.printStackTrace();
       }


    }

}
