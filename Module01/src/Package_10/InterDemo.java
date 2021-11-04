package Package_10;

/*
 * 测试类
 * */
/*接口的成员特点
* 成员变量
*   只能是常量
*   默认修饰符：public static final
* 构造方法
*   接口没有构造方法：因为接口主要是对行为进行抽象的，是没有具体存在
* 一个类如果没有父类，默认继承自Object
* 成员方法
*   只能是抽象方法
*   默认修饰符：public abstract
*关于接口中的方法，JDK8和JDK9中有一些新特性，后面再讲解*/
public class InterDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        //i.num=20;
        System.out.println(i.num);
        //i.num2=40;
        System.out.println(i.num2);
        i.method();
        i.show();
    }
}
