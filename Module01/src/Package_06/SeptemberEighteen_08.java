package Package_06;
//用StringBuilder实现字符串反转
import java.util.Scanner;

public class SeptemberEighteen_08 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        String result = myReverse(line);
        System.out.println(result);
    }
    public static String myReverse(String s){

        /*StringBuilder sb =new StringBuilder(s);
        sb.reverse();
        String sb2 = sb.toString();
        return sb2;
         */
        return new StringBuilder(s).reverse().toString();
    }

}
