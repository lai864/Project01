package Package_06;
/*键盘录入字符串，使用程序输出字符串
* public char charAt(int index),返回索引值。从0开始
* public int length，返回字符串长度
* 数组的长度：数组名.length
* 字符串长度：字符串对象.length()*/
import java.util.Scanner;

public class SeptemberEighteen_01 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        //遍历字符串，首先要能够获取到字符串的每一个字符
        //System.out.println(line.charAt(0));
        //System.out.println(line.charAt(1));
        //System.out.println(line.charAt(2));
        for(int i=0;i<line.length();i++){
            System.out.print(line.charAt(i));


        }
        System.out.println();
        System.out.println(line.length());

    }
}
