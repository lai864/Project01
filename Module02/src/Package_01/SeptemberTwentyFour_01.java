package Package_01;
/*内部类概述
* 内部类：就是一个类中定义一个类，举例：在一个类A的内部定义一个类B，类B就被称为内部类
*
* 内部类的定义格式
*   格式：
* public class 类名{
*       修饰符 class 类名{
*           }
* }
*
* 范例：
* public class Outer{
*       public class Inner {
*   }
* }
*
* 内部类的访问特点
*   内部类可以直接访问外部类的成员，包括私有
*   外部类要访问内部类的成员，必须创建对象*/



/*成员内部类
* 按照内部类在类中的定义位置不同，可以分为如下两种形式
*   在类的成员位置：成员内部类
*   在类的局部位置：局部内部类
*
* 成员内部，外界如何创建对象使用呢？
*   格式：外部类名.内部类名 对象名 = 外部类对象 内部对象
*   范例：Outer.inner oi = new Outer().new Inner()*/


/*局部内部类
* 局部内部类是方法中定义的类，所以外界是无法直接使用，需要在方法内部创建对象并使用
* 该类可以直接访问内部类的成员，也可以访问方法内的局部变量*/


/*匿名内部类(是局部内部类的一种特殊格式)
* 前提:存在一个类或者接口，这里的类可以是具体类也可以是抽象类
* 格式：
*   new 类名或者接口名(){
*       重写方法；
*   };
*
*   范例：
*       new Inner(){
*   public void show(){
*       }
*   };
* 本质：是一个继承了该类或者实现了该接口的子类匿名对象*/
public class SeptemberTwentyFour_01 {
    private int num=10;
    public class Inner{
        public void show(){
            System.out.println(num);
        }
    }

    //外部类要访问内部类的成员，必须创建对象（使用方法）
    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
