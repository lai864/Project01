package Package_08;//继承//标准Nurse.java Person.java Doctor.java PndDemo.java
/*super
*   super关键词和this关键字的用法类似
*       this:代表本类对象的引用（即调用的对象）
*       super:代表父类储存空间的标识（可以理解为父类对象引用）*/



/*继承中构造方法的访问特点
* 子类中所有的构造方法都会默认访问父类的无参构造方法
* 为什么呢
*   因为子类会继承父类中的数据，可能还会使用父类的数据。所以，子类初始化之前，一定要先完成父类数据的初始化
*   每一个子类构造方法的第一条默认语句都是：super()
*
*       如果父类中没有无参构造方法，只要带参构造方法，该怎么办呢？
*   通过使用super关键字去显示带参构造方法
*   父类中自己提供一个无参构造方法
* 推荐自己给出无参构造方法*/


/*继承中成员方法的访问特点
 *   通过子类对象访问一个方法（当父子有相同的方法）
 * 子类成员范围找
 * 父类成员范围找
 * 如果都没有就报错（不考虑父亲的父亲）*/


/*方法重写
* 方法重写概述
*   子类中出现了和父类中一样的方法声明
*
* 方法重写的应用
* 当子类需要父类的功能，而功能主体子类有自己特有内容时，可以重写父类的方法，这样，即沿袭
* 了父亲的功能，又定义了子类特有的内容
* 练习：手机类和新手机类
*
* @Override
*   是一个注解（注解后面会学习到）
*   可以帮我们检查重写方法的方法声明的正确性*/


/*方法重写注意事项
*   私有方法不能被重写（父类私有成员子类是不能继承的）
*   子类方法访问权限不能更低（public>默认>私有）*/


/*JAVA中继承的注意事项
*   Java中只支持单继承，不支持多继承
*   Java中类支持多层继承*/
public class Son extends Father {
    //public int age = 20;

    public void show() {
        int age = 30;
        System.out.println(age);
        //我要访问本类的成员变量age,怎么办呢？
        System.out.println(this.age);
        //我要访问父类的成员变量age,怎么办呢？
        System.out.println(super.age);
    }


        public Son(){
        //super(20);
            System.out.println("Son无参构造方法被调用");
        }
        public Son(int age){
        //super(20);
            System.out.println("Son中带参构造方法被调用");
        }
    }


