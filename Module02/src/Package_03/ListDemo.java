package Package_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*List集合概述和特点
*   List集合概述
* 有序集合（也称为序列），用户可以精确控制列表中每个元素的插入位置。用户可以通过数据索引访问元素，
* 并搜索列表中的元素
* 与Set集合不同，列表通常允许重复的元素
*
* List集合特点
* 有序：存储和取出的元素一致
* 可重复：存储的元素可以重复*/
public class ListDemo {
    /*List集合特点
     * 有序：存储和取出的元素一致
     * 可重复：存储的元素可以重复*/
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");

        System.out.println(list);

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
