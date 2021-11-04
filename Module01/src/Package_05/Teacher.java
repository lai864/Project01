package Package_05;

/*构造方法是一种特殊的方法
功能:完成对象数据的初始化
* 作用：创建对象
*       格式：
*       public class 类名{
*           修饰符 类名(参数){   //使用无参构造方法，要手写一个无参构造方法(可以忽略，肯定多数写有参构造方法)
*           }
*       }
修饰符一般用public*/
    /*public Student(){
        System.out.println("无参构造方法");
    }
     */
public class Teacher {
    private String name;
    private int age;

    public Teacher(){}
    public Teacher(String name){
        this.name=name;
    }

    public Teacher(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void show(){
        System.out.println(name+","+age);
    }
}
