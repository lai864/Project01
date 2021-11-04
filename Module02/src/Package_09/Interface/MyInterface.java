package Package_09.Interface;
/*接口中默认方法
 * 接口中默认方法的定义格式
 *   格式：public default 返回值类型，方法名（参数列表）{}
 *   范例：public default void show3(){}
 *
 * 接口中默认方法的注意事项：
 *   默认方法不是抽象方法，所以不强制重写，但是可以重写，重写的时候去掉default关键字
 *   public可以省略，default不能省略
 * */
public interface MyInterface {
    void show1();

    void show2();

//    public default void show3(){
//        System.out.println("接口中默认方法");
//    }
        //不强制重写，可以重写,重写时去掉default关键字
     default void show3(){
        System.out.println("接口中默认方法");
//        method();
//        eat();
    }

    //只能用接口调用方法
    static void show4(){
        System.out.println("接口中静态方法");
//        eat();

    }

    //接口中私有方法（抽取相同部分），接口静态方法不能调用，
//    private void method(){
//        System.out.println("Java工程师1");
//        System.out.println("Java工程师2");
//        System.out.println("Java工程师3");
//    }
//    //接口中静态私有方法，接口默认方法和接口静态方法中都能调用
//    private static void eat(){
//        System.out.println("Java工程师1");
//        System.out.println("Java工程师2");
//        System.out.println("Java工程师3");
//    }
}
