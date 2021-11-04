package Package_02;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String s1 =  DateUtils.dateToString(d,"yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String s = "2021-8-25 22:08:45";
        Date d2 = DateUtils.stringToDate(s,"yyyy-MM-dd HH:mm:ss");
        System.out.println(d2);


    }
}
