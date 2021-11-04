package Package_10;

public class DongWuDemo {
    public static void main(String[] args) {
        //创建对象，按照多态的方式
        DongWu d = new Mao();
        d.setName("加菲猫");
        d.setAge(2);
        d.eat();
        System.out.println(d.getName()+","+ d.getAge());

        d =new Mao("猫咪",5);
        d.eat();
        System.out.println(d.getName()+","+ d.getAge());
    }
}
