package package_07;
//创建线程的方式四：使用线程池
//还有一种Callable接口
/*
* 好处：
* 1.提高响应速度（减少了创建新线程的时间）
* 2.降低了资源消耗（重复利用线程池中线程，不需要每次都创建）
* 3.便于线程管理
* corePoolSize:核心池的大小
* maximumPoolSize:最大线程数
* keepAliveTime:线程没有任务时最多保持多长时间会终止*/
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPool {
    public static void main(String[] args) {
        //实现接口
        Thread take1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        });

        Thread take2 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });


        //继承Thread类
        Thread take3 = new Thread(){
           @Override
           public void run() {
               for (int i = 0; i < 10; i++) {
                   System.out.println(Thread.currentThread().getName()+":"+"高铁");
               }
           }
       };

            //函数式接口,Lambda表达式作参数
            Runnable r1 = ()->{
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+":"+"飞机");
                }
            };

            Thread take4 =new Thread(r1);

        //Lambda表达式自动推导
        Thread take5 = new Thread(() ->{
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+":"+"汽车");
                }
            });


        //1.提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

         ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
        //设置线程池的属性
        //System.out.println(service.getClass());对象service的反射实现类
//        service1.setKeepAliveTime();
//        service1.setCorePoolSize(10);


       //2.执行指定的线程的操作，需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(take1);//service.execute()适合用于Runnable
        service.execute(take3);
        service.execute(take4);
        service.execute(take5);
        //service.submit(Callable callable);适合用于Callable

        //关闭连接池
        service.shutdown();
    }
}


class MyPoolThread{

}