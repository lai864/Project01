package Package_10;

public class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("教练吃东西");
    }

    public void teach(){
        System.out.println("教练教学");
    }
}
