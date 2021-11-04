package Package_06;
/*统计字符串大小写，数字个数*/
import java.util.Scanner;

public class SeptemberEighteen_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String line = sc.nextLine();


        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if ('A' <= ch  && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }

        System.out.println(bigCount);
        System.out.println(smallCount);
        System.out.println(numberCount);

    }
}
