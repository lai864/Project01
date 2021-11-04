package Package_08;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        while (true) {
            //系统界面
            System.out.println("........欢迎━(*｀∀´*)ノ亻!来到学生管理系统");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入选择");

            Scanner sc = new Scanner(System.in);

            //选择操作
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                   // System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    upDate(array);
                    break;
                case "4":
                    //System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.exit(0);
            }
        }

    }

    public static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);

        //输入学生信息
        String sid;
        while(true) {
            System.out.println("请输入学号");
            sid = sc.nextLine();

            boolean flag = isUsed(array,sid);
            if (flag){
                System.out.println("你输入的学生学号已被添加，请重新输入");
            }else{
                break;
            }
        }
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        System.out.println("请输入年龄");
        String age = sc.nextLine();
        System.out.println("请输入地址");
        String address= sc.nextLine();

        //创建学生对象接收
        Student student = new Student();
        student.setSid(sid);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);

        //将学生对象录入集合
        array.add(student);

        System.out.println("添加成功");
    }

    public static void findAllStudent(ArrayList<Student> array){
        //如果系统没有录入信息
        if (array.size()==0){
            System.out.println("系统无信息，请先录入信息");
            //return;程序不再往下执行  break;跳出循环
            return;
        }

        System.out.println("学号\t\t\t姓名\t\t\t年龄\t\t地址");

        for(int i=0;i<array.size();i++){
            Student student = array.get(i);
            System.out.println(student.getSid()+"\t\t"+student.getName()+"\t\t\t"+student.getAge()+"岁\t\t"+student.getAddress());
        }
        System.out.println("查找成功");
    }

    public static boolean isUsed(ArrayList<Student> array,String sid){
        boolean flag =false;

            for(int i=0;i<array.size();i++){
                Student student = array.get(i);
                if (student.getSid().equals(sid)){
                    flag=true;
                    break;
                }
            }
            return flag;
    }

    public static void deleteStudent(ArrayList<Student> array){
        Scanner sc =new Scanner(System.in);
        //输入要删除的学生学号
        System.out.println("请输入要删除的学生学号");
        String sid = sc.nextLine();

        for (int i=0;i<array.size();i++){
            Student student = array.get(i);
            if (student.getSid().equals(sid)){
                array.remove(i);
                break;
            }
        }
        System.out.println("删除成功");
    }

    public static void upDate(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);

        //请输入要修改的学生学号
        System.out.println("请输入要修改的学生学号");
        String sid = sc.nextLine();

        //输入新信息
        System.out.println("请输入学生新姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生新家庭地址");
        String address = sc.nextLine();

        //创建学生对象接收信息
        Student s =new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);//这个s对象是集合修改后的元素

        //历遍集合修改信息
        for (int i=0;i<array.size();i++){
             Student student = array.get(i);//这个student对象是集合里的元素
            if (student.getSid().equals(sid)){
                array.set(i,s);
                break;
            }
        }
        System.out.println("修改成功");
    }
}
