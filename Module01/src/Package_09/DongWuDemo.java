package Package_09;

public class DongWuDemo {
    public static void main(String[] args) {
        DongWu d = new Mao();
        d.setName("加菲猫");
        d.setAge(2);
        d.eat();
        System.out.println(d.getName()+","+d.getAge());

        d = new Mao("猫咪",5);
        d.eat();
        System.out.println(d.getName()+","+ d.getAge());


    }


}
