package Package_02;
/*
*基本数据类型包装类概述
* 将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据
* 常用的操作之一：用于基本数据类型和字符串之间的转换
* 基本数据类型：byte    short    int    long    float    double    char       boolean
*   包装类    Byte    Short   Integer  Long   Float    Double    Character   Boolean
*
* */


/*构造方法：
*   Public Integer(int value):根据int值创建Integer对象（过时）
*   Public Integer(String s):根据String值创建Integer对象（过时）
*
* 静态方法获取对象
*   public static Integer valueOf(int i):返回指的int 值的Integer实例
*   public static Integer valueOf(String s):返回一个保存指定值的Integer对象String*/
public class IntegerDemo {
    public static void main(String[] args) {
        //需求：我要判断一个数据是否在int范围内？
        //public static final int MIN_VALUE
        //public static final int MAX_VALUE
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        /*
        //Public Integer(int value):根据int值创建Integer对象（过时）
        Integer i = new Integer(100);
        System.out.println(i);


        //Public Integer(String s):根据String值创建Integer对象（过时）
        Integer i2 = new Integer("100");
        System.out.println(i2);
        Integer i3 = new Integer("abc");//NumberFormatException
        */

        //public static Integer valueOf(int i):返回指的int 值的Integer实例
        Integer i =  Integer.valueOf(100);
        System.out.println(i);


        //public static Integer valueOf(String s):返回一个保存指定值的Integer对象String
        Integer i2 = Integer.valueOf("100");
        System.out.println(i2);
        System.out.println("..........");


        /*int和String的相互转换*/

        //int转换成string类型
        int number =100;
        //方式一
        String s1 = ""+number;
        System.out.println(s1);

        //方式二
        //public static String.valueOf(int a)
        String s2 = String.valueOf(number);
        System.out.println(s2);
        System.out.println("......");


        //String转换为int类型
        //方式一
        String s3="100";
        Integer i3 = Integer.valueOf(s3) ;
        //public int intValue()
        int x = i3.intValue();
        System.out.println(x);

        //方式二
        //public static int parseInt (String s)
        int y = Integer.parseInt(s3);
        System.out.println(y);
    }
}
