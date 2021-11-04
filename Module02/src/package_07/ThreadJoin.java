package package_07;

public class ThreadJoin extends Thread{
    public ThreadJoin() {
    }

    public ThreadJoin(String name) {
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
