package Package_05;
/*String概述
*   String类在java.lang包下，所以使用的时候不需要导包
*
*    String类代表字符串，Java程序中所有字符串（例如"abc","哔哩哔哩"是双引号括起来的）都被实现为此类的实例
*    也就是说，Java程序中所有的双引号字符串，都是String类的对象
*
* 字符串的特点
*   字符串不可变，它们的值在创建后不能更被改
*   虽然String的值是不可变的，但是它们可以被共享
*   字符串效果上相当于字符数组(char[]),但底层原理是字节数组(byte[])
*   字符串分配了地址，该地址内容不变，字符串变量重新赋值相当于指向新的内存空间*/
public class SeptemberSeventeen_01 {
    public static void main(String[] args) {
        String s1 = "中国";
        String s2 = "中国";

        String s3 = s1;
        System.out.println(s3);
        System.out.println(s1==s2);


    }
}
