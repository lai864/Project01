package Package_08;

public class Dau extends Mon {
        public void method(){
            System.out.println("Dau中method()方法被调用");
        }

    public void show(){
            super.show();
        System.out.println("Dau中show()方法被调用");
    }
}
