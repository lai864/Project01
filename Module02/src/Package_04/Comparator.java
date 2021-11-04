package Package_04;
/*储存学生对象并遍历。创建TreeSet集合使用带参构造方法
 * 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 *
 * 用匿名内部类重写compare(To1,To2)方法*/

import java.util.TreeSet;

public class Comparator {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new java.util.Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });


        Student s1 = new Student();
        s1.setName("jmss");
        s1.setAge(23);

        Student s2 = new Student();
        s2.setName("hsmw");
        s2.setAge(234);

        Student s3 = new Student();
        s3.setName("wangzhuxian");
        s3.setAge(18);

        Student s4 = new Student();
        s4.setName("zxishi");
        s4.setAge(18);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}

