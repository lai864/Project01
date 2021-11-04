package package_07;

public class ThreadDaemon extends Thread{
    public ThreadDaemon() {
    }

    public ThreadDaemon(String name) {
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
