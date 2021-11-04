package Package_06;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/*点名器
* 将文件里的名字，储存到Arraylist集合
*/
public class Io_17 {
    public static void main(String[] args) throws IOException {
     /*   BufferedWriter bw = new BufferedWriter(new FileWriter("Module02\\名字.txt"));
        ArrayList<String> array = new ArrayList<String>();
        array.add("巨魔叔叔");
        array.add("混世魔王");
        array.add("王祖贤");
        array.add("b站小霸王");
        array.add("b站叔叔");

        for (String name:array){
            bw.write(name);
            bw.newLine();
            bw.flush();
        }
        bw.close();

      */

        BufferedReader br = new BufferedReader(new FileReader("Module02\\名字.txt"));
        ArrayList<String> array = new ArrayList<String>();

        Random number = new Random();

        String line;
        while ((line=br.readLine())!=null){
            array.add(line);
        }
        int i = number.nextInt(array.size());
        String name = array.get(i);
        System.out.println("点到的是："+name);
        br.close();
    }
}
