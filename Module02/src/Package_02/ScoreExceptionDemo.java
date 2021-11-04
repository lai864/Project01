package Package_02;
/*自定义异常
* 格式：
* public class 异常类名 extends Exception{
*           无参构造
*           带参构造
*       }
* 范例：
*   public class ScoreException extends Exception{
*           public ScoreException(){}
*           public ScoreException(String message){
*                   super(message);
* }
* }*/



/*throws和throw的区别
*
* throws
* 用在方法声明后，跟的是异常类名
* 表示抛出异常，有该方法的调用者来处理
* 表示出现异常的一种可能性，并不一定会发生这些异常
*
* throw
* 用在方法体内，跟的是异常对象名
* 表示抛出异常，由方法体内的语句的处理
* 执行throw一定抛出了某种异常
* */
public class ScoreExceptionDemo {
    public void checkScore(int score) throws ScoreException{
        if(score<0 || score>100){
            throw new ScoreException();//这里是throw不是throws
        }else {
            System.out.println("分数正常");
        }
    }
}
