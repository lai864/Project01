package Package_08;

public class SchoolDemo {
    public static void main(String[] args) {


        Teachers t1 = new Teachers();
        t1.setName("林青霞");
        t1.setAge(20);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

        Teachers t2 = new Teachers("巨魔叔叔",23);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();
    }
}
