package Package_06;

import java.io.FileInputStream;
import java.io.IOException;

/*io流读数据*/
//此程序读char,输出字符型 Io_4程序String字符串型



public class Io_02 {
    public static void main(String[] args) throws IOException  {
        FileInputStream fis = new FileInputStream("Module02\\fos.txt");

        //file.read不断读取数据，没有数据输出-1

        int by;
        while ((by=fis.read())!=-1){ //先读数据，再判断是否等于-1
            System.out.print((char)by);
        }


        fis.close();

    }
}
