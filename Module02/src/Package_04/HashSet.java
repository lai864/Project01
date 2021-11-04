package Package_04;

import java.util.Iterator;

/*HashSet集合保证元素唯一性源码分析:
*   HashSet集合添加一个元素过程：位置是否有元素
*   先比较HashCode(哈希值)是否相等
*   再用equals()比较内容是否相同
*   注意：都相同才不会储存*/
public class HashSet {
    public static void main(String[] args) {
        /*练习：HashSet输出学生对象
        * 必须在学生类里重写equals()和HashSet()方法*/

        java.util.HashSet<Student> hs = new java.util.HashSet<Student>();
        Student s1 = new Student("巨魔叔叔",23);
        Student s2 = new Student("混世魔王",45);
        Student s3 = new Student("王祖贤",18);
        Student s4 = new Student("巨魔叔叔",23);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

      /*  Iterator<Student> it = hs.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
       */

        for (Student s:hs){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
