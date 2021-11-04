package package_07;

public class Producer implements Runnable{

    private Box b;

    public Producer(Box b) {//b是对象了，debug
        this.b=b;//变量b等于对象b
    }

    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            b.put(i);
        }
    }
}
