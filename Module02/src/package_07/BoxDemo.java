package package_07;

public class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box();


        Producer pd = new Producer(b);
        Customer co = new Customer(b);

        Thread t1 = new Thread(pd);
        Thread t2 = new Thread(co);

        t1.start();
        t2.start();
    }
}
