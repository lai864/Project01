package Package_08;

public class Nurse extends Person {
    public Nurse(){}
    public Nurse(String name, int age) {
        //this.name = name;
       // this.age = age;
        super(name,age);
    }

    public void teach() {
        System.out.println("努力学习");
    }


}
