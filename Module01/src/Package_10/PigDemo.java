package Package_10;
/*类名作为形参和返回值
*   方法的形参是类名，其实需要的是该类的对象
*   方法的返回值是类名，其实返回的是该类的对象*/
public class PigDemo {
    public static void main(String[] args) {
        PigOperator po = new PigOperator();
        Pig p = new Pig();
        po.pigOperator(p);

        Pig p2 = po.getPig();//new Pig()
        p2.eat();

    }
}
