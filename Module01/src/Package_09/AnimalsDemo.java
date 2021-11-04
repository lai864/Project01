package Package_09;
/*多态概述
 *   同一个对象，在不同时刻表现出来的不同形态
 *
 * 举例：猫
 * 我们可以说猫是猫：猫cat=new猫()
 * 我们也可以说猫是动物：动物animal=new猫();
 * 这里猫在不同时刻表现出了不同的形态，这就是多态
 *
 * 多态的前提和体现
 *   有继承/实现关系
 *   有方法重写
 *   有父类引用指向子类对象*/

/*多态中成员访问特点
* 成员变量：编译看左边，执行看左边
* 成员方法：编译看左边，执行看右边
*
* 为什么成员变量和成员方法的访问不一样呢？
* 因为成员方法有重写，而成员变量没有*/



/*多态的好处和弊端
*   多态的好处：提高了程序的扩展性
* 具体体现：定义方法的时候，使用父类型作为参数，将来在使用的时候，使用具体的子类型参与操作
*   多态的弊端：不能使用子类的特有功能*/
public class AnimalsDemo {
    public static void main(String[] args) {
      /*  //有父类引用指向子类对象
        Animals a = new Cats();

        System.out.println(a.age);
        //System.out.println(a.weight);

        a.eat();
        //a.playGame();
       */

        //创建动物操作类的对象，调用方法
        AnimalOperator ao = new AnimalOperator();
        Cats c = new Cats();//Cats c= new Cats();
        ao.useAnimal(c);


        Dogs d = new Dogs();//Dogs d = new Dogs();
        ao.useAnimal(d);
    }

}
