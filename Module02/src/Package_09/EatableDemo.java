package Package_09;

public class EatableDemo {
    public static void main(String[] args) {
        //在主方法中调用useEatable方法
        Eatable e = new EatableImpl();
        useEatable(e);

        //匿名内部类方法
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("巨魔叔叔要来了");
            }
        });

        //Lambda方法
        useEatable(() ->{
            System.out.println("巨魔叔叔要来了");
        });
    }

    private static void useEatable(Eatable e){ //这是一个变量，接收了一个对象，接口不能实例化，却能作为变量指引
        e.eat();
    }


}
