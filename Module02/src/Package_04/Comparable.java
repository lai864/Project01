package Package_04;

import java.util.TreeSet;

/*自然排序Comparable的使用
* 储存学生对象并遍历。创建TreeSet集合使用无参构造方法
* 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
*
* 结论
* 用TreeSet集合储存自定义对象，无参构造方法使用的是自然排序对元素进行排序的
* 自然排序，就是让元素所属的类实现Comparable接口，重写compareTo(To)方法
* 重写方法时，一定要注意排序规则必须按照要求的主要条件和次要条件来写*/
public class Comparable {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();

        Student s1 = new  Student();
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

        Student s5 = new Student("巨魔叔叔",45);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student s:ts){
            System.out.println(s.getName()+","+s.getAge());
        }
    }

}
