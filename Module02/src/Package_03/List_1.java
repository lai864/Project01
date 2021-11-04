package Package_03;

import java.util.ArrayList;
import java.util.List;

/*List集合特有方法
*
*   void add(int index ,E element):在此中的指定位置插入指定的元素
*   E remove(int index):删除指定索引处的元素，返回被删除的元素
*   E set(int index,E element):修改指定索引处的元素，返回被修改的元素
*   E get(int index):返回指定索引处的元素*/
public class List_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

        list.add(0,"upup");
        list.remove(1);
        list.set(2,"go");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.size());
        for (int i=0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
