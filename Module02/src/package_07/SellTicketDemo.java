package package_07;
/*多线程程序是否会有数据安全问题的标准
*   是否是多线程环境
*   是否有共享数据
*   是否有多条语句操作共享数据
*
* 如何解决多线程安全问题呢？
*   基本思想：让程序没有安全问题的环境
*
* 怎么实现呢？
*   把多条语句操作共享数据的代码给锁起来，让任意时刻只能有一个线程执行即可
*
*  同步代码块
* 锁多条语句操作共享数据，可以使用同步代码块实现
*   格式;
* synchronized(任意对象){
*          多条语句操作共享数据的代码
*      }
*  synchronized(任意对象)：就相当于给代码加锁了，任意对象就可以看成一把锁
*
* 同步的好处和弊端
*   好处：解决了多线程的数据安全问题
*   弊端：当线程很多时，因为每个线程都回去判断同步上的锁，这是哼耗费资源的，无形中会降低程序的运行效率   */



/*同步方法
* 同步方法：就是把synchronized关键字加到方法上
*   格式：
*   修饰符synchronized返回值类型（方法参数）{}
*
* 同步方法的锁对象是什么?
*   是this，main方法的锁跟随写的方法里的锁
*
* 同步静态方法：就是把synchronized关键字加到静态方法上
* 格式：
*   修饰符 static synchronized返回值类型 方法名（方法参数）{}
*
* 同步静态方法的锁对象是什么呢？
*   类名.class*/
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();

        Thread t1 = new Thread(st,"售票口1");
        Thread t2 = new Thread(st,"售票口2");
        Thread t3 = new Thread(st,"售票口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
