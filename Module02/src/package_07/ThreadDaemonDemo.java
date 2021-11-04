package package_07;
/*void setDaemon(boolean on) :此线程标记为守护线程，当运行的线程都是守护线程时，JVM虚拟机退出
标志着该线程是 daemon线程或用户线程。  */
public class ThreadDaemonDemo {
    public static void main(String[] args) {


        ThreadDaemon td1 = new ThreadDaemon("关羽");
        ThreadDaemon td2 = new ThreadDaemon("张飞");

        //设置主线程
        Thread.currentThread().setName("刘备");

        //设置守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);


        td1.start();
        td2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
