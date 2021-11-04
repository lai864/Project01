package Package_09;

public class Gou extends DongWu{
    public Gou() {
    }

    public Gou(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("狗吃东西");
    }
}
