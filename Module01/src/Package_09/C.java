package Package_09;
/*向上转型
*   从子到父
*   父类引用指向子类对象
*
* 向下转型
*   从父到子
*   父类引用转为子类对象*/
public class C extends A{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void playGame(){
        System.out.println("猫捉迷藏");
    }
}
