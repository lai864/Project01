package Package_10;
/*类的主动引用（一定会发生类的初始化）
* 类的被动引用（不会发生类的初始化）*/
public class Test_04 {
    static {
        System.out.println("main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //主动引用
//        Son son =new Son();

        //反射也会产生主动引用
//        Class.forName("Package_10.Son");



        //不会产生类的引用方法
//        System.out.println(Son.b);//当访问一个静态域时，只有真正声明这个域的类才会被初始化，如：子类调用父类变量，不会初始化子类

        //
      //  Son[] arr = new Son[10];//同数组定义类引用，不会触发此类的初始化。这是一个数组，没有任何类被加载和初始化

        System.out.println(Son.M);
        //引用常量也不会触发此类的初始化（常量在链接阶段就存入调用类的常量池中了）
    }
}

class Father{
    static int b= 2;

    static{
        System.out.println("父类被加载");
    }
}

class Son extends Father{
    static {
        System.out.println("子类被加载");
        m=300;
    }

    static int m = 100;//静态变量
    static final int M =1;//常量
}
