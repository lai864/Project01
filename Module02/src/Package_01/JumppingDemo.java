package Package_01;
/*接口名作为形参和返回值
方法的形参是接口名，其实需要的是该接口的实现类对象
* 方法的返回值是接口名，其实返回的是该接口的实现类对象*/
public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Cats c = new Cats();
        jo.useJumpping(c);
//        c.jump();

        Jumpping j2 = jo.getJump();
        j2.jump();


    }
}
