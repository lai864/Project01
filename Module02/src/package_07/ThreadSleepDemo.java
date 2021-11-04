package package_07;
/*static void sleep(long millis)
当前正在执行的线程休眠（暂停执行）为指定的毫秒数，根据精度和系统定时器和调度的准确性。 */
public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep("曹操");
        ThreadSleep ts2 = new ThreadSleep("刘备");
        ThreadSleep ts3 = new ThreadSleep("孙权");

        ts1.start();
        ts2.start();
        ts3.start();


    }
}
