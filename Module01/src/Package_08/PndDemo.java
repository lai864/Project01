package Package_08;

public class PndDemo {
    public static void main(String[] args) {
        //无参构造方法
        Nurse n = new Nurse();
        n.setName("林青霞");
        n.setAge(20);
        System.out.println(n.getName()+","+n.getAge());
        n.teach();

        //带参构造方法
        Nurse n2=new Nurse("巨魔叔叔",23);
        System.out.println(n2.getName()+","+n2.getAge());
        n2.teach();

        //无参构造方法
        Doctor d = new Doctor();
        d.setName("混世魔王");
        d.setAge(9999);
        System.out.println(d.getName()+","+d.getAge());
        d.study();

        //带参构造方法
        Doctor d2 = new Doctor("五五五",18);
        System.out.println(d2.getName()+","+d2.getAge());
        d2.study();
    }
}
