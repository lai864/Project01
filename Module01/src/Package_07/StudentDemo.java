package Package_07;
/*需求创建一个存储学生到校的集合，存储三个学生对象，使用程序实现在控制台遍历该集合*/

import java.util.ArrayList;

public class StudentDemo {
    public static void main(String[] args) {
        /*Student s1 = new Student();
        s1.setName("555");
        s1.setAge(18);
        s1.show();

        Student s2 = new Student("kiva",18);
        s2.show();
         */
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("555", 18);
        Student s2 = new Student("kiva", 18);
        Student s3 = new Student("w", 18);

        //添加学生对象到集合
        array.add(s1);
        array.add(s2);
        array.add(s3);

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
