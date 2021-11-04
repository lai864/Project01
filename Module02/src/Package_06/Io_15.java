package Package_06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*字符输出流在文件写入ArrayList集合*/
public class Io_15 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("Module02\\ArrayList.txt"));

        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");

    for (String s:array){
        bw.write(s);
        bw.newLine();
        bw.flush();
    }

        bw.close();
    }
}
