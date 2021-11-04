package Package_09;

public class FlyableDemo {
    public static void main(String[] args) {
        //匿名内部类方法
        useFlyable(new Flyable() {//实现了接口，括号里有实现的接口，重写的方法
            @Override
            public void fly(String s) {
                System.out.println(s);//重写了方法，这个方法被useFlyable中的变量f调用
                System.out.println("混世魔王大战巨魔叔叔");
            }
        });

        useFlyable((String s) ->{
            System.out.println(s);
            System.out.println("混世魔王");
        });
    }


    private static void useFlyable(Flyable f){//括号里有接口，有方法，可以是普通类，抽象类
        f.fly("巨魔叔叔要来了");//调用方法给实参
    }
}
