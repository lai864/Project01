package Package_03;
//历遍学生
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemos {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student s1 = new Student("巨魔叔叔",23);
        Student s2 = new Student("混世魔王",32);
        Student s3 = new Student("王祖贤",18);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("......");

        for (int i=0;i<list.size();i++){
            Student student = list.get(i);
            System.out.println(student.getName()+","+student.getAge());
        }
    }
}
