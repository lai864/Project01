package Package_10;

import java.lang.annotation.ElementType;

/*哪些类型可以有Class对象
*   class:外部类，成员（成员内部类，静态内部类），局部内部类，匿名内部类
*   interface:接口
*   []:数组
*   enum:枚举
*   annotation:注解@interface
*   primitive type:基本数据类型
*   void*/
public class Test_03 {
    public static void main(String[] args) {
        Class c1 = Object.class;//类
        Class c2 = Comparable.class;//接口
        Class c3 = String[].class;//一维数组
        Class c4 = int[][].class;//二维数组
        Class c5 = Override.class;//注解
        Class c6 = ElementType.class;//枚举
        Class c7 = Integer.class;//基本数据类型
        Class c8 = void.class;//void
        Class c9 = Class.class;//Class

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
    }
}
/*1.加载到内存，会产生一个类对应class对象(这时候产生了class对象，加载到内存时)
* 2.链接：链接结束后m=0;
* 3.初始化：
*       <clinit>()*{
                      System.out.println("A类静态代码块初始化")
                       m=300;
                       m=100;
                     }
                    m=100;
 */