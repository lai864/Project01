package Package_06;
/*StringBuilder概述
*   StringBuilder是一个可变的字符串类，我们可以看成是一个容器
*   这里的类可变是指StringBuilder对象中的内容是可变的
*
* String和StringBuilder的区别
*   String：内容是不可变的
*   StringBuilder：内容是可变的*/


/*StringBuilder构造方法
*   public StringBuilder()：创建一个空白可变字符串对象，不含有任何内容
*   public StringBuilder(String str):根据字符串内容，来创建可变字符串对象*/



/*StringBuilder 的添加和反转方法
*   public StringBuilder append(任意类型)：添加数据，并返回到数据本身
*   public StringBuilder reverse():返回相反的字符序列*/


public class SeptemberEighteen_05 {
    public static void main(String[] args) {
        //public StringBuilder()：创建一个空白可变字符串对象，不含有任何内容
        StringBuilder sb  =new StringBuilder();
        System.out.println(sb);
        System.out.println(sb.length());

        //public StringBuilder(String str):根据字符串内容，来创建可变字符串对象
        StringBuilder sb2 = new StringBuilder("HelloWorld");
        System.out.println(sb2);
        System.out.println(sb2.length());
        System.out.println("......");

        //创建对象
        StringBuilder sb3 =new StringBuilder();

        //public StringBuilder append(任意类型)：添加数据，并返回到数据本身
        //StringBuilder sb4 = sb3.append("HelloWorld");

        //System.out.println("sb3:"+sb3);
        //System.out.println("sb4:"+sb4);

        //sb3.append("Hello");
        //sb3.append("World");
        //sb3.append("111");

        //链式编程
        sb3.append("Hello").append("World").append("111");
        System.out.println("sb3:"+sb3);


        //public StringBuilder reverse():返回相反的字符序列
        sb3.reverse();
        System.out.println("sb3:"+sb3);
    }
}
