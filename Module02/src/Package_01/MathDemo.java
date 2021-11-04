package Package_01;
/*Math概述
*Math包含执行基本数字运算方法
*
* 没有构造方法，如何使用类中的成员呢？
* 看类的成员是否都是静态的，如果是，通过类名就可以直接调用*/
public class MathDemo {
    public static void main(String[] args) {
        //public static int abs (int a):返回参数的绝对值
        System.out.println(Math.abs(80));
        System.out.println(Math.abs(-80));
        System.out.println("......");
        //public static double ceil (double a):返回大于或等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.56));
        System.out.println("......");
        //public static double floor (double a):返回小于或等于参数的最大double值，等于一个整数
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.56));
        System.out.println("......");
        //public static int round(floor a):按照四舍五入返回最接近参数的int
        System.out.println(Math.round(12.34F));
        System.out.println(Math.round(12.56F));
        System.out.println("......");
        //public static int max(int a, int b):返回两个int值中的较大值
        System.out.println(Math.max(66,88));
        System.out.println("......");
        //public static int min(int a ,int b):返回两个int值中的角小值
        System.out.println(Math.min(40,50));
        System.out.println("......");
        //public static double pow (double a,double b):返回a的b次幂的值
        System.out.println(Math.pow(2.0,3.0));
        System.out.println("......");
        //public static double random():返回值为double的正值,(取值范围是零到一，0.0,1.0)
        //System.out.println(Math.random());
        System.out.println((int)(Math.random()*100)+1);//能去1到100了



    }
}
