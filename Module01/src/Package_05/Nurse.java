package Package_05;
//标椎型
public class Nurse {
    private String name;
    private int age;
    //编写无参构造
    public Nurse(){}
    //编写有参构造
    public Nurse(String name,int age){
        this.name=name;
        this.age=age;
    }

//无参
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name+","+age);
    }

}
