package Package_09.Interface;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface mi1 = new MyInterfaceImplOne();
        mi1.show1();
        mi1.show2();
        mi1.show3();
        MyInterface.show4();

        MyInterface mi2 = new MyInterfaceImplTwo();
        mi2.show1();
        mi2.show2();
    }
}
