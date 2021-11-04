package Package_06;
//键盘输入字符串，使用程序反转输出
import java.util.Scanner;

public class SeptemberEighteen_04 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        String result = number(line);//number方法的参数是line
        System.out.println(result);
    }
    public static String number(String s){


        String ss="";
        for(int i=s.length()-1;i>=0;i--){
            ss+=s.charAt(i);
        }
        return ss;

    }

}
