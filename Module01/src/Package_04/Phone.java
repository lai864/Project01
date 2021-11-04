package Package_04;
/*类的定义：
* 步骤：
*   定义类
*   编写类成员变量
*   编写类的成员方法*/
public class Phone {
   //成员变量（类中方法外的变量）
    String brand;
    int price;

    //成员方法
    //局部变量（方法内的变量）
    public void call(){
        System.out.println("打电话");
        //局部变量 int i=0;也是局部变量
    }
    public void sendMessage(){
        System.out.println("发消息");
    }
}
/*成员变量和局部变量的区别
*   类中位置不同
*   内存中位置不同，成员变量在堆内存，局部变量在栈内存
*   生命周期不同，成员变量随着对象的存在而存在，随着对象的消失而消失。局部变量随着方法的调用而存在，随着方法的调用完毕而消失
*   初始化值不同，成员变量有默认的初始值。局部变量没有默认的初始值，必须先定义，赋值，才能使用*/
