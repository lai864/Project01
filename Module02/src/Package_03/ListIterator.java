package Package_03;

import java.util.ArrayList;
import java.util.List;

/*ListIterator
*   ListIterator:列表迭代器
* 通过List集合的listIterator()方法得到，所以说它是List集合的特有的迭代器
*
* ListIterator中的常用方法
*   E next():返回迭代中的下一个元素
*   boolean hasNext():如果迭代器有更多元素，则返回true
*   E previous():返回列表中的下一个元素
*   boolean hasPrevious();如果此列表迭代器在相反方向历遍列表时具有更多元素，则返回更多元素，否则返回true
*   void add(E e):将指定的元素插入列表*/
public class ListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

//        // 通过List集合的listIterator()方法得到
//        java.util.ListIterator<String> lit = list.listIterator();
//        while (lit.hasNext()){
//            String s = lit.next();
//            System.out.println(s);
//        }
//        System.out.println("......");
//
//
//        while (lit.hasPrevious()){
//            String s = lit.previous();
//            System.out.println(s);
//        }

        java.util.ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            String s = lit.next();
            if(s.equals("world")){
                lit.add("javaee");
            }
        }
        System.out.println(list);
    }
}
