package Package_05;
/*public String nextLine()
 *    获取键盘录入的数据*/
import java.util.Scanner;
public class Api {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //接收数据
        System.out.println("请输入一个字符串数据：");
        //String line = sc.nextLine();
        String line = sc.nextLine();//写好右边后Ctrl+Alt+v;回车自动生成左边String line
        //输出数据
        System.out.println("你输入的数据是："+line);
    }
}
