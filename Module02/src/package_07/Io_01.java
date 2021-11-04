package package_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/*特殊操作流*/
/*static PrintStream out ：标准输出流（System.out）
* static InputStream in ：标准输入流（System.in）由Scanner类实现最方便*/
/**/
/**/
public class Io_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//键盘输入数据，控制台输出，由字节到字符，过于麻烦，
        // 直接用Scanner类,但是标准输入流（System.in）可以一直录入，不用做死循环
        String line;
        while ((line=br.readLine())!=null){

        }


        ///*static PrintStream out ：标准输出流（System.out）
       PrintStream ps = System.out;
       ps.println("hello");

        System.out.println("hello");//最简单的方法输出
        System.out.println();//换行
      //  System.out.print();//不带方法，必须有打印的数据
    }
}
