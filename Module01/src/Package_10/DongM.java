package Package_10;

public class DongM extends Dong implements Jumpping{
    public DongM(){}

    public DongM(String name,int age){
        super(name,age);
    }

    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump(){
        System.out.println("猫可以跳高了");
    }
}
