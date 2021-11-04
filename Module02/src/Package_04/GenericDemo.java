package Package_04;

public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> g1 = new Generic<String>();
        g1.setT("巨魔叔叔");
        System.out.println(g1.getT());
        /*泛型方法
         * 泛型方法的定义格式：
         *   格式：修饰符<类型>返回值类型方法名(类型变量名){}
         *   范例：public<T> void show(T t){}*/
        g1.show("王祖贤");
        g1.show(123);

        Generic<Integer> g2 = new Generic<Integer>();
        g2.setT(134);
        System.out.println(g2.getT());

        Generic<Boolean> g3 = new Generic<Boolean>();
        g3.setT(true);
        System.out.println(g3.getT());



        /*泛型接口
泛型接口定义格式：
    格式：修饰符interface接口名<类型>{}
    范例：public interface Generic<T>{}
*/

        ImpGeneric<String> i1 = new GenericImp<String>();
        i1.eat("混世魔王");

        ImpGeneric<Integer> i2 = new GenericImp<Integer>();
        i2.eat(12);

    }
}
