package Package_02;

import java.util.Date;

/*
* public Date();分配一个Date,并初始化，以便它代表被分配的时间，精确到毫秒
* public Date(long date):分配一个Date对象，并将其初始化表示从标准时间起指定的毫秒数
* */


/*public long getTime():获取的是日期对象从1970年1月1日 00:00到现在的毫秒值
* public void setTime(long time):设置时间，给的是毫秒值*/
public class SeptemberTwentyFive_02 {
    public static void main(String[] args) {
        //public Date();分配一个Date,并初始化，以便它代表被分配的时间，精确到毫秒
        Date d = new Date();
        System.out.println((d));

        // public Date(long date):分配一个Date对象，并将其初始化表示从标准时间起指定的毫秒数
        long date =1000*60*60;
        Date d2 = new Date(date);
        System.out.println(d2);
        System.out.println(".....");


        Date d3 = new Date();
        /*
        //public long getTime():获取的是日期对象从1970年1月1日 00:00到现在的毫秒值
        System.out.println(d3.getTime()*1.0/1000/60/60/24/365);

         */

       // public void setTime(long time):设置时间，给的是毫秒值
  //      long time = 1000*60*60;
        long time = System.currentTimeMillis();//System是系统类，获取系统当前时间
        d3.setTime(time);
        System.out.println(d3);
    }
}
