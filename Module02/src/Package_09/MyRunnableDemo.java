package Package_09;
/*Lambda表达式是函数式编程思想
* 面向对象思想强调“必须通过对象的形式来做事情
* 函数式编程思想则尽量忽略面向对象的复杂语法，“强调做什么，而不是以什么形式去做”
*
* Lambda表达式的标准格式
*   格式：(形式参数)->{代码块}
*   形式参数：如果有多个参数，参数之间用逗号隔开，如果没有参数，留空即可
*   ->:有中文中画线和大于符号组成，固定写法，代表指向动作
*   代码块：是我们具体要做的事情，也就是以前我们写的方法体内容*/
public class MyRunnableDemo {
    public static void main(String[] args) {
        //用类实现
        MyRunnable my = new MyRunnable();

        Thread t = new Thread(my);
        t.start();


        //匿名内部类实现
        new Thread(new Runnable() {  // (): 里面没有内容，可以看做方法形式参数为空
            @Override
            public void run() {
                System.out.println("多线程程序启动了");
            }
        }).start();

        //Lambda表达式实现
        new Thread( () -> {
            System.out.println("多线程程序启动了");
        }).start();
        /*Lambda表达式代码分析
        *   (): 里面没有内容，可以看做方法形式参数为空
        *   ->:用箭头指向后面要做的事情
        *   {}:包含一段代码，我们称之为代码块，可以看成是方法体里的内容
        *
        * 组成Lambda表达式的三要素：形式参数，代码块*/
    }
}
