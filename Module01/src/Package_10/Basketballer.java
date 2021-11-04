package Package_10;

public class Basketballer extends Player{
    public Basketballer() {
    }


    public Basketballer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("篮球运动员吃饭");
    }

    @Override
    public void study(){
        System.out.println("篮球运动员学习");
    }


}
