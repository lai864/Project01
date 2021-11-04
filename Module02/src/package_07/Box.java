package package_07;
/*生产者——赶过去——消费者
* Object类的等待和唤醒方法：
*   void wait();导致当前线程等待，直到另一个线程调用该对象的notify()或notifyAll()方法
*   void notify()：唤醒正在等待对象监视器的单个线程
*   void notifyALL()：唤醒正在等待对象监视器的所有线程*/
public class Box {
    private int milk;
    private boolean state = false;


    public synchronized void put(int milk){
        if (state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("生产者生产了第"+milk+"瓶牛奶");

        state = true;

        notifyAll();

    }



    public synchronized void get(){
        if (!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者拿到了第"+milk+"瓶牛奶");

        state = false;

        notifyAll();
    }

}
