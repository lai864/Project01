package Package_04;



//使用类变量
//使用类方法
public class StudentDemo {
    public static void main(String[] args) {


    /*    //创建对象
        Student s = new Student();//s在内存开辟空间 ，s是对象，一个类可以有多个对象，每个对象名不能相同
        System.out.println(s);
        //System.out.println(s.name);
        //System.out.println(s.age);
        System.out.println(s.name+","+s.age);

        s.name = "赖慎琛";
        s.age = 21;
        System.out.println(s.name+","+s.age);

        Student s2= s;//两个对象相等，跟随改变对象
        s.age=18;
        s.name="赖成";
        System.out.println(s.age+","+s.name);
        System.out.println(s2.age+","+s2.name);

        //使用类方法
        s.study();
        s.doHomework();

     */
        Student s1 = Student.student;

        System.out.println(s1);

    }
}
