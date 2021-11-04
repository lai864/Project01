package Package_06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*Io流文本文件复制*/
public class Io_03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\steam\\荷塘月色.txt");

        FileOutputStream fos = new FileOutputStream("Module02\\荷塘月色.txt");

        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }


        fis.close();
        fos.close();
    }
}
