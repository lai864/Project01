package package_07;
/*多线程的实现方式
*   方式1：继承Thread类
*       定义一个类MyThread继承Thread类
*       在MyThread类中重写run()方法
*       创建MyThread类的对象
*       启动线程
*
* 两个小问题
*   为什么要重写run方法？
*       因为run()是被用来封装线程执行的代码
*   run()方法和start()方法的区别
*       run():封装线程执行的代码，直接调用，相当于普通方法的调用
*       start():启动线程，然后由jvm调用此线程的run()方法 */


/*Thread类中获取和设置线程名称的方法
*  void setName(String name) ：改变该线程的名称等于参数 name。
*  String getName() :返回此线程的名称。  */


/*线程调度
*   JAVA使用的是抢占式调度模型
* 抢占式调度模型：优先让优先级高的线程使用CPU，如果线程优先级相同，那么会随机选择一个，优先级高的线程获取的CPU时间片相对多一些
* 执行程序有随机性，抢到CPU的使用权是不一定的
*
* Thread类中设置和获取线程优先级的方法
*   int getPriority() ：返回此线程的优先级
*   void setPriority(int newPriority) ：更改此线程的优先级
* 线程默认优先级是5，线程优先级的范围是1—10
* 线程优先级高仅仅表示线程获取的CPU时间片的几率高，但是要在次数比较多，或者多次运行的时候才能看到你想要的效果。   */
public class MyThreadDemo {
    public static void main(String[] args) {
//        MyThread my1 = new MyThread();
//        MyThread my2 = new MyThread();

//        my1.run();
//        my2.run();
        //void setName(String name) ：改变该线程的名称等于参数 name
//        my1.setName("飞机");
//        my2.setName("高铁");
        //Thread (String name)
        MyThread my1 = new MyThread("飞机");
        MyThread my2 = new MyThread("高铁");
        MyThread my3 = new MyThread("火车");



//        System.out.println(Thread.MAX_PRIORITY);
//        System.out.println(Thread.NORM_PRIORITY);
//        System.out.println( Thread.MIN_PRIORITY);
        //优先级默认为5
//        System.out.println(my1.getPriority());
//        System.out.println(my2.getPriority());
//        System.out.println( my3.getPriority());
        my1.setPriority(1);
        my2.setPriority(5);
        my3.setPriority(10);
        //start():导致该线程开始执行；java虚拟机调用这个线程的 run方法。
        my1.start();
        my2.start();
        my3.start();

        //static Thread currentThread():返回当前正在执行的线程对象的引用。
        System.out.println(Thread.currentThread().getName());

    }
}
