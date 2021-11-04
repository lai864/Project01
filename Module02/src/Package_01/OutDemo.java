package Package_01;
/*局部内部类
 * 局部内部类是方法中定义的类，所以外界是无法直接使用，需要在方法内部创建对象并使用
 * 该类可以直接访问内部类的成员，也可以访问方法内的局部变量*/
public class OutDemo {
    public static void main(String[] args) {
        Out o = new Out();
        o.method();
    }
}
