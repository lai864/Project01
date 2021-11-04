package Package_06;
/*OutputStreamWriter是从字符流到字节流的桥梁：使用指定的charset将写入的字符编码为字节。 它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集。
*
*
* InputStreamReader是从字节流到字符流的桥梁：它读取字节，并使用指定的charset将其解码为字符。 它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集。 */

import java.io.*;

public class Io_08 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Module02\\fos.txt"),"UTF-8");
        osw.write("中国");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("Module02\\fos.txt"));
        int ch;
        while ((ch=isr.read())!=-1){
            System.out.print((char)ch);
        }
        isr.close();

        /*InputStreamReader​(InputStream in) 创建一个使用默认字符集的InputStreamReader。
          InputStreamReader​(InputStream in, String charsetName) 创建一个使用命名字符集的InputStreamReader。
*/




    }
}
