package package_07;

public class ThreadSleep extends Thread{
    public ThreadSleep(){}

    public ThreadSleep(String name){
        super(name);
    }

    @Override
    public  void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
            try {
                Thread.sleep(1000);//让这个线程休息1秒，剩两个线程
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
