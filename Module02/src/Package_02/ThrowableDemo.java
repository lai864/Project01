package Package_02;
/*异常概述
* 异常：就是程序出现了不正常的情况
* 异常体系  Throwable(error,Exception(RuntimeException,非RuntimeException))
* Error:严重问题，不需要处理
* Exception:称为异常类，它表示程序本身可以处理的问题
RuntimeException:在编译期是不检查的，出问题后，需要我们回来修改代码
* 非RuntimeException:编译期就必须处理的，否则程序不能通过编译，就更不能正常运行了

* */


/*JVM的默认处理方案
* 如果程序出现了问题，我们没有做任何处理，最终JVM会做默认的处理
*   把异常的名称，异常原因及异常出现的位置信息输出在了控制台
*   程序停止执行*/


/*异常
* 异常处理之try....catch...
* 格式：
*   try{
*           可能出现异常的代码；
*   }catch(异常类名 变量名){
*           异常的处理代码
*   }
* 执行流程：
* 程序从try里面的代码开始执行
* 出现异常，会自动生成一个异常类对象，该异常对象将被提交给Java运行时系统
* 当Java运行时系统接收到异常对象时，会到catch中去找匹配的异常类，找到后进行异常的处理
* 执行完毕之后，程序还可以继续往下执行*/



/*public String getMessage():返回此throwable的详细详细字符串
* public String toString()：返回此可抛出的简短描述
* public void printStackTrace():把异常错误信息输出在控制台*/
public class ThrowableDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");

    }
    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//new ArrayIndexOutOfBoundsException();
        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("您访问的数组的索引不存在");//处理异常，让程序往下执行
//            e.printStackTrace();//控制台输出异常位置，信息

            //public String getMessage():返回此throwable的详细详细字符串
//            System.out.println(e.getMessage());
            //3
//            System.out.println(e.toString());//public String toString()：返回此可抛出的简短描述

            //public void printStackTrace():把异常错误信息输出在控制台
            e.printStackTrace();
        }
    }
}
/*public class Throwable{
        public String getMessage() {
             return detailMessage;
    }
}
* */
