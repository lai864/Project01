package Package_09;

public class Mao extends DongWu{
    public Mao(){}

    public Mao(String name,int age){
        super(name,age);
    }

    @Override
    public void eat(){
        System.out.println("猫吃东西");
    }
}
