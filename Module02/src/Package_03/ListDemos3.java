package Package_03;
//数据结构之栈和队列：栈：先进后出  队列：先进先出
/*常见数据结构之链表：数据加地址组成一个元素，因为有head在链表第一个元素的数据位置，null在最后一个元素地址位置
* 所以中间元素地址在上一个元素。对比数组增删快，查询慢（必须从头开始查询）*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*需求：用三种方法遍历学生对象*/
public class ListDemos3 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student s1 = new Student("巨魔叔叔",23);
        Student s2 = new Student("混世魔王",34);
        Student s3 = new Student("王祖贤",18);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println(".....");

        ListIterator<Student> lit = list.listIterator();
        while (lit.hasNext()){
            Student s = lit.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("......");

        for (Student s:list){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
