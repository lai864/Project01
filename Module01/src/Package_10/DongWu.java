package Package_10;

public abstract class DongWu {
    private String name;
    private int age;

    public DongWu() {
    }

    public DongWu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("动物东西");
    }
}
