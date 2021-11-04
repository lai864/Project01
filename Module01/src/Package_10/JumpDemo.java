package Package_10;
/*接口的特点
* 接口用关键字interface修饰
*   public interface 接口名{}
* 实现接口用implements表示
* public class 类名implements接口名{}
* 接口不能实例化
*   接口如何实现实例化呢，参照多态的方法，通过实现类对象实例化，这叫接口多态
*   多态的形式：具体类多态，抽象类多态，接口多态（常用后两种）
*   多态的前提：有继承或者实现关系，有方法重写，有父(类/接口)引用指向(子?实现)类对象
* 接口的实现类
*   要么重写接口中的所有抽象方法
*   要么是抽象类*/
public class JumpDemo {
    public static void main(String[] args) {
       // SeptemberTwentyThree_02 s = new SeptemberTwentyThree_02();
        SeptemberTwentyThree_02 s = new Student();
        s.jump();


    }
}
