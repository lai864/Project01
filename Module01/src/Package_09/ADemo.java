package Package_09;
/*向上转型
 *   从子到父
 *   父类引用指向子类对象
 *
 * 向下转型
 *   从父到子
 *   父类引用转为子类对象*/
public class ADemo {
    public static void main(String[] args) {
        //多态
        A a = new C();//向上转型
        a.eat();
        //a.playGame();


/*
    //创建C类的对象
        C c = new C();
        c.eat();
        c.playGame();
 */

        //向下转型
        C c = (C)a;
        c.eat();
        c.playGame();


        //向上转型
        a = new D();
        a.eat();

        //向下转型
        D d = (D)a;
        d.eat();
        d.playGame();



    }


}
