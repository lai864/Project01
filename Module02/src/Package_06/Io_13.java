package Package_06;

import java.io.*;

/*字符缓冲流特有功能，换行和读行
* BufferedReader
* void newLine():写一行行分隔符，行分隔符字符串有系统定义属性
*
* BufferedWriter
* public String readLine() 读一行文本,不包含任何终止符，到达流的结尾输出null  */
public class Io_13 {
    public static void main(String[] args) throws IOException {
    /*    //写数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("Module02\\13.txt",true));
        for (int i=0;i<10;i++){
            bw.write("world");
            bw.newLine();
            bw.flush();
        }


        bw.close();
     */
        //读数据
        BufferedReader br = new BufferedReader(new FileReader("Module02\\13.txt"));
//        String line = br.readLine();
//        System.out.println(line);

        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
