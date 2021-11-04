package Package_07;


import java.util.ArrayList;
import java.util.Scanner;

public class NurseManager {
    public static void main(String[] args) {
        ArrayList<Nurse> array = new ArrayList<Nurse>();
        //系统界面
        while (true) {
            System.out.println(".......欢迎━(*｀∀´*)ノ亻!来到护士管理系统......");
            System.out.println("1.添加护士");
            System.out.println("2.删除护士");
            System.out.println("3.修改护士");
            System.out.println("4.查看所有护士");
            System.out.println("退出");
            System.out.println("请输入你的选择");

        //调用方法
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    System.out.println("添加护士");
                    addNurse(array);
                    break;
                case "2":
                    System.out.println("删除护士");
                    deleteNurse(array);
                    break;
                case "3":
                    System.out.println("修改护士");
                    updateNurse(array);
                    break;
                case "4":
                    System.out.println("查看护士");
                    findAllNurse(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);//JVM退出
            }




        }
    }

    public static void addNurse(ArrayList<Nurse> array) {
        //键盘添加学生信息
        Scanner sc = new Scanner(System.in);

        //为了让sid在while循环外面被访问到，我们把它定义在循环外
        String sid;

        //为了让程序回到这里，我们使用循环实现
        while(true) {
            System.out.println("请输入护士学号");
            sid = sc.nextLine();
            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("你输入的学号已经被使用，请重新输入");
            }else{
                break;
            }
        }

        System.out.println("请输入护士姓名");
        String name = sc.nextLine();
        System.out.println("请输入护士年龄");
        String age = sc.nextLine();
        System.out.println("请输入护士地址");
        String address = sc.nextLine();

        //创建护士对象
        Nurse s = new Nurse();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //录入集合对象
        array.add(s);

        System.out.println("添加成功");


    }

    public static void deleteNurse(ArrayList<Nurse> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要删除学生的学号：");
        String sid = sc.nextLine();

        int index =-1;
        for(int i=0;i<array.size();i++){
            Nurse s = array.get(i);
            if(s.getSid().equals(sid)){
                //int index =i;
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("该信息不存在，请重新输入");
        }else{
            System.out.println("删除学生成功");
        }
        array.remove(index);
        System.out.println("删除成功");
    }

    public static void findAllNurse(ArrayList<Nurse> array) {

            //如果系统里没有信息
        if(array.size()==0){
            System.out.println("无信息，请先添加信息，再查询");
            return;//作用：程序不再往下执行
        }

        System.out.println("学号\t\t\t姓名\t\t\t年龄\t\t地址");
        //遍历输出系统里的信息
        for (int i = 0; i < array.size(); i++) {
            Nurse s = array.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t\t" + s.getAge() + "岁\t\t" + s.getAddress());
        }
    }

    public static void updateNurse(ArrayList<Nurse> array){
        //键盘录入要更改的学生信息，显示提示信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要修改的学生学号");
        String sid = sc.nextLine();

        //键盘输入你要修改的信息
        System.out.println("请输入学生的新姓名");
        String name =sc.nextLine();
        System.out.println("请输入学生的新年龄");
        String age =sc.nextLine();
        System.out.println("请输入学生的新家庭地址");
        String address =sc.nextLine();

        //创建学生对象
        Nurse s = new Nurse();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //遍历集合修改对应学生信息
        for(int i=0;i<array.size();i++){
            Nurse nurse = array.get(i);
            if(nurse.getSid().equals(sid)){
                array.set(i,s);
                break;
            }
        }
        System.out.println("修改学生成功");
    }

    public static boolean isUsed(ArrayList<Nurse> array,String sid){
        //如果与集合中某一个学生学号相同，返回true，如果不相同，返回false
        boolean flag=false;

        for(int i=0;i< array.size();i++){
            Nurse nurse = array.get(i);
                if(nurse.getSid().equals(sid)){
                    flag=true;
                    break;
                }
        }
        return flag;
    }

}
