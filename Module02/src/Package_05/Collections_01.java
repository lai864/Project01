package Package_05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*Collections概述和使用
*   Collections类的概述
*       是针对集合操作的工具类
* Collections类的常用方法
*   public static<T extends Comparable<?super T>> void sort(List<T> list):将指定的列表按升序排列
*   pub;ic static void reverse(List<?> list):反转指定列表中的元素的顺序
*   public static void shuffle(List<?> list):使用默认的随机源随机排列指定的列表*/
public class Collections_01 {
    public static void main(String[] args) {
        //public static<T extends Comparable<?super T>> void sort(List<T> list):将指定的列表按升序排列
        List<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(34);
        list.add(47);
        list.add(1);

        Collections.sort(list);

        //pub;ic static void reverse(List<?> list):反转指定列表中的元素的顺序
        Collections.reverse(list);
        System.out.println(list);

        // public static void shuffle(List<?> list):使用默认的随机源随机排列指定的列表
        Collections.shuffle(list);
        System.out.println(list);
    }
}
