package Package_09.Lambda_01;



public class MyInterfaceDemo {
    public static void main(String[] args) {
        //Lambda表达式可以作为方法的参数传递，也可以作为局部变量
        MyInterface my = () -> System.out.println("函数式接口");//用作局部变量
        my.show();
    }
}
