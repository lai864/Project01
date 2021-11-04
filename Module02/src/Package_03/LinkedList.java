package Package_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*List集合子类特点
* List集合常用子类：ArrayList:底层数据结构是数组，查询快，增删慢
* LinkedList:底层数据结构是链表，查询慢，增删快
*
* 练习：
* 分别使用ArrayList和LinkedList完成储存字符串遍历*/


/*LinkedList集合的特有功能
* public void addFirst(E e) ：在该列表插入指定的元素
* public void addLast(E e):将指定元素追加到此列表的末尾
* public E getFirst():返回此列表的第一个元素
* public E getLast():返回此列表的最后一个元素
* public E removeFirst():从列表中删除并返回第一个元素
* public E removeLast():从列表中删除并返回最后一个元素*/
public class LinkedList {
    public static void main(String[] args) {


        ArrayList<Student> array = new ArrayList<Student>();
        Student s1 = new Student("巨魔叔叔", 12);
        Student s2 = new Student("混世魔王", 34);
        Student s3 = new Student("王祖贤", 45);
        array.add(s1);
        array.add(s2);
        array.add(s3);

        Iterator<Student> it = array.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println(".......");

        ListIterator<Student> lit = array.listIterator();
        while (lit.hasNext()){
            Student s = lit.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println(".......");

        for (Student s:array){
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println(".......");

        java.util.LinkedList<Student> linkedList = new java.util.LinkedList<Student>();
        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);

        Iterator<Student> it2 = array.iterator();
        while (it2.hasNext()){
            Student s = it2.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println(".......");

        ListIterator<Student> lit2 = array.listIterator();
        while (lit2.hasNext()){
            Student s = lit2.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println(".......");

        for (Student s:linkedList){
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println(".......");



        java.util.LinkedList<String> linkedList2 = new java.util.LinkedList<String>();
        linkedList2.add("hello");
        linkedList2.add("world");
        linkedList2.add("java");

        //public void addFirst(E e) ：在该列表插入指定的元素
        //public void addLast(E e):将指定元素追加到此列表的末尾
        linkedList2.addFirst("javaee");
        linkedList2.addLast("javaee");

//        public E getFirst():返回此列表的第一个元素
//        public E getLast():返回此列表的最后一个元素
//        System.out.println(linkedList2.getFirst());
//        System.out.println(linkedList2.getLast());


//        public E removeFirst():从列表中删除并返回第一个元素
//        public E removeLast():从列表中删除并返回最后一个元素
        linkedList2.removeFirst();
        linkedList2.removeLast();


        System.out.println(linkedList2);

    }
}