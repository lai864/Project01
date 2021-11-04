package Package_03;

import java.util.ArrayList;
import java.util.Collection;

/*Collection集合的常用方法
*
* boolean add(E e):添加元素
* boolean remove(Object o):从集合中移除指定的元素
* void clear():清空集合中的元素
* boolean contains(Object o):判断集合中是否存在指定的元素
* boolean isEmpty():判断集合是否为空
* int size():集合的长度，也就是集合中元素的个数*/

//Alt+7查看类信息
public class Collection_02 {
    public static void main(String[] args) {
          Collection<String> c = new ArrayList<>();
          //boolean add(E e):添加元素
//        System.out.println(c.add("hello"));
//        System.out.println("world");
//        System.out.println(c);
        c.add("hello");
        c.add("world");
        c.add("Java");


        //boolean remove(Object o):从集合中移除指定的元素
//        System.out.println(c.remove("Java"));

        //void clear():清空集合中的元素
//       c.clear();

        //boolean contains(Object o):判断集合中是否存在指定的元素
//        System.out.println(c.contains("hello"));


        //boolean isEmpty():判断集合是否为空
//        System.out.println(c.isEmpty());

        //int size():集合的长度，也就是集合中元素的个数
        System.out.println(c.size());

        System.out.println(c);
    }
}
