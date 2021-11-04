package Package_09;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("小柴");
        d.setAge(6);
        System.out.println(d.getName()+","+d.getAge());
        d.show();


        Dog d2 = new Dog("大汪",5);
        System.out.println(d2.getName()+","+ d2.getAge());
        d2.show();

        Cat c =new Cat();
        c.setName("猫咪");
        c.setAge(3);
        System.out.println(c.getName()+","+ c.getAge());
        c.method();

        Cat c2 = new Cat("花猫",4);
        System.out.println(c2.getName()+","+ c2.getAge());
        c2.method();

    }


}
