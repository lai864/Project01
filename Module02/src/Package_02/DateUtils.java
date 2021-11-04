package Package_02;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils() {}
        /*public void dateToString () {
            Date d = new Date();
            SimpleDateFormat adf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String s = adf.format(d);
            System.out.println(s);
        }
         */
        public static String dateToString(Date date,String format) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            String s = sdf.format(date);
            return s;
        }

        public static Date stringToDate(String s,String format) throws ParseException {
            SimpleDateFormat sdf =new SimpleDateFormat(format);
            Date d = sdf.parse(s);
            return d;
            }




        /*public void stringToDate () {
            String s2 = "2021-8-25- 21:42:42";
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d2 = sdf2.parse(s2);
            System.out.println(d2);
        }

         */

}
