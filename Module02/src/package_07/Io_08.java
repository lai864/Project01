package package_07;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*Properties和Io流结合的方法
* void lod(inputStream inStream):从输入字节流读取属性列表（键和元素对）
*
* *void lod(Radder reader):从输入字符流读取属性列表（键和元素对）
*
  void store(OutputStream out,String comments):将此属性列表（键和元素对）写入properties表中
  * 以适合于使用lod(InputStream)方法的格式写入输出字节流
  *
  * void store(Writer writer,String comments):将此属性列表（键和元素对）写入properties表中
  * 以适合于使用lod(Reader)方法的格式写入输出字符流*/
public class Io_08 {
    public static void main(String[] args) throws IOException{
       // store();
        myLoad();
    }

    private static void myLoad() throws IOException{

        Properties prop = new Properties();
        FileReader fr = new FileReader("Module02\\Properties.txt");

        prop.load(fr);
        fr.close();
        String s = prop.getProperty("a0001");
        System.out.println(s);


        System.out.println(prop);//加载到集合
    }

  /*  private static void store() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("a0001","巨魔叔叔");
        prop.setProperty("a0002","混世魔王");
        prop.setProperty("a0003","王祖贤");
        prop.setProperty("a0004","b站小霸王");
        prop.setProperty("a0005","b站叔叔");
        prop.setProperty("a0006","法外狂徒");

        //void store(Writer writer,String comments):将此属性列表（键和元素对）写入properties表中
        //  * 以适合于使用lod(Reader)方法的格式写入输出字符流
        FileWriter fw = new FileWriter("Module02\\Properties.txt");
        prop.store(fw,"这是一个集合");//OutputStream out:输出流方法//String comments:描述信息

        fw.close();
    }

   */
}
