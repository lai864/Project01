package package_07;
/*线程
*   线程：是进程中的单个顺序控制流
*   单线程：一个进程如果只有一条条执行程序，则称为单线程程序
*   多线程：一个进程如果有多条执行程序，则称为多线程程序
* 举例：记事本，单线程
*       扫雷，多线程*/




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
 *       start():启动线程，然后由jvm调用此线程的run()方法
 *
 *
 *  方式2：
 * 实现Runnable接口
 *  定义一个MyRunnable类实现Runnable接口
 *  在MyRunnable类中重写run()方法
 *  创建MyRunnable类的对象，把MyRunnable对象作为构造方法的参数
 *  启动线程
 *
 * 相比继承Thread类，实现Runnable接口的好处
 *  避免了Java单继承的局限性*/

/**/
public class Thread_01 {

}
