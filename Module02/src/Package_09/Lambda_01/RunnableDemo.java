package Package_09.Lambda_01;
/*函数式接口作为方法的参数*/
public class RunnableDemo {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName()+":"+"线程启动了");
//            }
//        }).start();

        starThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":"+"多线程启动了");
            }
        });

        starThread(() -> System.out.println(Thread.currentThread().getName()+":"+"多线程启动了"));
    }

    private static void starThread(Runnable r){ //接口Runnable,这个类，定义变量，作为形参。匿名内部类传递实参new Runnable对象。Runnable 为函数式接口，可以把一个Lambda表达式作为一个实参传递给形参函数式接口
//        Thread t = new Thread(r);
//        t.start();
        new Thread(r).start();
    }
}
