package Package_04;
//编写类变量名
//编写类方法
public class Student {
   /* String name;
    int age;

    public void study(){
        System.out.println("学习");
    }
    public void doHomework(){
        System.out.println("做作业");
    }

    */

   public static Student student = new Student();


    private Student() {
    }
}
/*private关键字
 *   是一个权限修饰符
 *   可以修饰成员（成员变量和成员方法）
 *   作用是保护成员不被别的类使用，被private修饰的成员只在本类中才能访问
 *
 * 针对private修饰的成员变量，如果需要被其他类使用，提供相应的操作
 *       提供“get变量名()”方法，用于获取成员变量的值，方法用public修饰
 *       提供“set变量名(参数)”方法，用于设置成员变量的值，方法用public修饰*/
