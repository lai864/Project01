package Package_09;
/*Lambda表达式的注意事项
 *   注意事项
 *       使用Lambda必须要有接口，并且要求接口中有且仅有一个抽象方法
 *       必须有上下文环境，才能推导出Lambda对应的接口
 *           根据局部变量的复值得知Lambda对应的接口：Runnable r = () -> System.out.println("Lambda表达式")
 *            根据调用方法的参数得知Lambda对应的接口：new Thread(() -> System.out.println("Lambda表达式)).start ();*/

/*Lambda表达式和匿名内部类的区别
 *   匿名内部类：实现者实现了一个接口，普通类或抽象类，实现者可以是方法，如useFlyable(接口，普通类，不能是抽象类)
 *   也可以是调用方法：如 jo.operator(接口)。也可以是类：new Thread(Socket s),Thread和Socket都是类
 *
 * 不管是匿名内部类，还是Lambda表达式，使用他们就是对接口多态实现的优化，不用创建子类，就能实现多线程和多态
 *
 * Lambda表达式只能实现接口
 * 匿名内部类能实现接口的多个抽象方法，Lambda表达式只能实现一个，默认实现接口的所有抽象方法，接口中超过一个抽象方法，Lambda表达式会报错。
 * 匿名内部类运行后后台产生字符文件，Lambda表达式不会*/
public class October_01 {
    public static void main(String[] args) {
        /*1、匿名内部类就是没有名字的内部类。这是Java为了方便我们编写程序而设计的一个机制。
        因为有时候有的内部类只需要创建一个它的对象就可以了，  即new一个对象，不用创建类，   像 new Thread(new Runnable(),new一个对象（前提是存在一个接口或父类，不能是抽象类）
        以后再不会用到这个类，这时候使用匿名内部类就比较合适，而且也免去了给它取名字的烦恼。
        2、如果满足下面的一些条件，使用匿名内部类是比较合适的：
        ·只用到类的一个实例。
        ·类在定义后马上用到。
        ·类非常小（SUN推荐是在4行代码以下）
        ·给类命名并不会导致你的代码更容易被理解。
        在使用匿名内部类时，要记住以下几个原则：
        ·匿名内部类不能有构造方法。
        ·匿名内部类不能定义任何静态成员、方法和类。
        ·匿名内部类不能是public,protected,private,static。
        ·只能创建匿名内部类的一个实例。
        ·一个匿名内部类一定是在new的后面，用其隐含实现一个接口或实现一个类。   像 第①种继承Thread：也可以写特定类在括号继承
        ·因匿名内部类为局部内部类，所以局部内部类的所有限制都对其生效。
        3、用匿名内部类创建多线程有两种方式，和创建一个线程是一样的。
        第①种继承Thread：
        new Thread(){
        public void run(){
        //do something
        };
        }.start();
        第②种实现 Runnable接口：
        new Thread(new Runnable() {
        public void run() {
        //do something
        };
        }) { }.start();
        */
        new Thread() {
            @Override
            public void run() {
                System.out.println("匿名内部类线程方法1");
            }
        }.start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类实现线程方法2");
            }
        }).start();
    }
}
