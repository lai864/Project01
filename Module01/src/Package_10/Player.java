package Package_10;

public class Player extends Person{
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("运动员吃饭");
    }

    public void study(){
        System.out.println("运动员学习");
    }
}
