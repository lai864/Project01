package package_07;
/* 方式2：
 * 实现Runnable接口
 *  定义一个MyRunnable类实现Runnable接口
 *  在MyRunnable类中重写run()方法
 *  创建MyRunnable类的对象，把MyRunnable对象作为构造方法的参数
 *  启动线程
 *
 * 相比继承Thread类，实现Runnable接口的好处
 *  避免了Java单继承的局限性*/
public class MyRunnableDemo {
    public static void main(String[] args) {
        //创建MyRunnable对象
        MyRunnable my = new MyRunnable();

        //将MyRunnable对象作为构造方法的参数
        Thread t1 = new Thread(my,"飞机");
        Thread t2 = new Thread(my,"高铁");


        t1.start();
        t2.start();
    }
}
