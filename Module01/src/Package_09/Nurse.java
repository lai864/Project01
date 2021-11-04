package Package_09;
/*static访问特点
* 非静态的成员方法
*   能访问静态的成员变量
*   能访问静态的成员方法
*   能访问静态的非静态成员变量
*   能访问非静态的成员方法
*
* 静态的成员方法
*   能访问静态的成员变量
*   能访问静态的成员方法
* 总结一句话就是：静态成员方法只能访问静态成员*/
public class Nurse {
    private String name;
    private static String university;
    //非静态成员方法
    public void show1(){

    }

    public void show2(){
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }
        //静态成员方法
    public static void show3(){

    }

    public static void show4(){
       // System.out.println(name);
        System.out.println(university);
        //show1();
        show3();
    }
}
