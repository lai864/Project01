package Package_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//需求：创建一个存储学生的集合，存储三个学生对象，使用程序实现在控制台遍历该集合
public class StudentDemo {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();
        Student s1 = new Student("巨魔叔叔",34);
        Student s2 = new Student("混世魔王",345);
        Student s3 = new Student("王祖贤",18);
        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> it = c.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
