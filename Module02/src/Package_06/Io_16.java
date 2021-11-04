package Package_06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*/*遍历在文件读出元素，写入集合*/
public class Io_16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Module02\\ArrayList.txt"));
        ArrayList<String> array = new ArrayList<String>();

        String line;
        while ((line=br.readLine())!=null){
            array.add(line);
        }

        for (String s:array){
            System.out.println(s);
        }
        br.close();
    }
}
