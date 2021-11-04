package Package_10;

public class DongDemo {
    public static void main(String[] args) {
        Dong d = new DongM();
        d.setName("加菲猫");
        d.setAge(3);
        System.out.println(d.getName()+","+ d.getAge());
        d.eat();
        //((DongM) d).jump();
        System.out.println("........");

        Jumpping j = new DongM();
        j.jump();

        d = new DongM("猫咪",6);
        d.eat();
        System.out.println(d.getName()+","+ d.getAge());
        System.out.println(".........");


        //使用这种，是标准，上面理解就行
        DongM m = new DongM("小花",1);
        m.eat();
        m.jump();
        System.out.println(m.getName()+","+ m.getAge());

    }
}
