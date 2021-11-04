package Package_02;

import java.util.Calendar;
import java.util.Scanner;

/*需求：输入某年，得到这年2月有多少天*/
public class MyCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        Scanner sc = new Scanner(System.in);
        //输入年份
        System.out.println("请输入年份");
        int year = sc.nextInt();

        c.set(year,2,1);
        c.add(Calendar.DATE,-1);

        int year2 = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        System.out.println(year2+"年二月有"+date+"天");

    }
}
