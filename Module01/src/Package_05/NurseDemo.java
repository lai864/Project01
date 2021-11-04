package Package_05;

public class NurseDemo {
    public static void main(String[] args) {
        //无参构造方法创建对象使用setXxx赋值
        Nurse n1 = new Nurse();
        n1.setName("赖成");
        n1.setAge(22);
        n1.show();

        //使用有参创建对象
        Nurse n2 = new Nurse("赖慎琛",22);
        n2.show();

    }
}
