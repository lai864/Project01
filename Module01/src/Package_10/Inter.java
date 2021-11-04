package Package_10;

public interface Inter {
    public int num = 10;
    public final int num2 = 20;
    int num3 = 30;//接口里的成员变量是常量默认被final和静态修饰，可以不写public修饰

    //public Inter(){}

    //public void show(){}

    public abstract void method();//抽象方法没有方法体
    void show();//默认有public abstract修饰
}
