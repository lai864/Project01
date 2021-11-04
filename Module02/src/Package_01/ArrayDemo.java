package Package_01;
//ArraysDemo.java的简便形式，即冒泡排序的套用公式
import java.util.Arrays;
/*
* Arrays 类包含用于操作数组的各种方法
*
* public static String toString(int[] a)返回指定数组的内容的字符串表示形式
*
* public static void sort(int[] a)按照数字顺序排列指定的数组
*
*工具类的设计思想：
* 构造方法用private修饰
* 成员用public static修饰
* */
public class ArrayDemo {
    public static void main (String[] args) {
        //定义一个数组
        int[] arr = {24,23,45,47};
        System.out.println("排序前:"+ Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("排序后："+Arrays.toString(arr));
    }
}
