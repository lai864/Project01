package Package_01;

public class JumperDemo {
    public static void main(String[] args) {
        JumperOperator jo = new JumperOperator();
        /*Jumper t = new TheJumper();
        jo.jumperOperator(t);
//可以不写了
        */


        //作用：可以只写一个类重写方法，就能多次实现方法，不用再写类就能实现别的对象
        jo.jumperOperator(new Jumper() {
            @Override
            public void jump() {
                System.out.println("TheJumper跳高");
            }
        });
//本质：是一个继承了该类或者实现了该接口的子类匿名对象
        jo.jumperOperator(new Jumper() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }
        });
    }
}
