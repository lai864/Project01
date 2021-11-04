package Package_10;

public abstract class Animals {
    private int age = 20;
    private final String city = "北京";
    public Animals(){}
    public Animals(int age,String city){
        this.age=age;
       // this.city=city;
    }


    public void show(){
        age=40;
        System.out.println(age);
        //city ="上海";
        System.out.println(city);
    }

    public abstract void eat();
}
