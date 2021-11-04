package Package_07;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherDemo {
    public static void main(String[] args) {
        ArrayList<Teacher> array = new ArrayList<Teacher>();
/*
        //键盘录入学生信息
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age =sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Teacher s1 = new Teacher();
        s1.setName(name);
        s1.setAge(age);

        //集合中添加学生对象
        array.add(s1);

 */
        addTeacher(array);
        addTeacher(array);
        addTeacher(array);

        //遍历集合，使用通用格式
        for(int i=0;i<array.size();i++){
            Teacher s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }

    }
    public static void addTeacher(ArrayList<Teacher> array) {
        //键盘录入学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Teacher s = new Teacher();
        s.setName(name);
        s.setAge(age);


        //集合中添加学生对象
        array.add(s);
    }
}
