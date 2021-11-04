package Package_05;
//this修饰的变量用于指代成员变量
//方法的形参如果与成员变量同名，不带this修饰的词指的是形参，而不是成员变量
//this：代表所在类的对象引用
//this解决局部变量隐藏成员变量
//方法被哪个对象调用，this就代表哪个对象
public class Student {
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name+","+age);
    }


}
/*1.封装概述
是面向对象三大特征之一（封装，继承，多态）
* 是面向对象编程语言对客观世界的模拟，客观世界成员变量都是隐藏在对象内部的，外界是无法直接操作的

2.封装原则
将某些信息隐藏在类内部，不允许外部程序直接访问，而是直接通过该类提供的方法来实现对隐藏信息的操作和访问
成员变量private，提供对应的getXXX()/setXxx()方法

3.封装好处
通过方法来控制成员变量的操作，提高了代码的安全性
吧代码用方法进行封装，提高了代码的复用性*/





