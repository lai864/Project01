package Package_02;
/*类方法就是静态方法，其他的就是实例方法。
* 实例方法可以对当前对象的实例变量进行操作，也可以对类变量进行操作，但类方法不能访问实例变量
* 实例方法必须由实例对象来调用，而类方法除了由实例对象调用外，还可以有类名直接调用*/
import java.util.Calendar;

/*Calendar类概述
* Calendar为某一时刻和一组日历字段之间的转换提供了一些方法，并为操作日历字段提供了一些方法
*
* Calendar提供了一个类方法getInstance用于获取Calendar对象，其日历字段已使用当前日期和时间初始化
* Calendar rightNow = Calendar.getInstance();*/


/*public int get(int field):返回给定日历字段*/

/*public abstract void add(int field,int amount):根据日历的规则，将指定的时间量添加或减去给指定的日历字段
* public final void set(int year ,int month,int date):设置当前日历年月日*/
public class CalendarDemo {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance();
        System.out.println(c);


        /*public int get(int field):返回给定日历字段*/
        //public int get(int field)
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year+"年"+month+"月"+date+"日");


        //public abstract void add(int field,int amount):根据日历的规则，将指定的时间量添加或减去给指定的日历字段
        //需求3年前的今天
//        c.add(Calendar.YEAR,-3);
//
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year+"年"+month+"月"+date+"日");

        //需求10年后的前5天
//        c.add(Calendar.YEAR,+10);
//        c.add(Calendar.DATE,-5);
//
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year+"年"+month+"月"+date+"日");


//        public final void set(int year ,int month,int date):设置当前日历年月日
        c.set(2022,11,30);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");

    }
}
