package Package_09.Lambda_02;

import java.util.function.Consumer;

/*Consumer接口
 * Consumer<T>:包含两个方法
 *   void accept(T t):对给定的参数执行此操作
 *   default Consumer<T> andThen(Consumer after):返回一个组合的Consumer,依次执行的操作，然后执行after操作
 *   Consumer<T>:接口也被称为消费型接口，它消费的数据的数据类型由泛型指定
 *
 * 消费者接口，没有返回值*/
public class ConsumerDemo {
    public static void main(String[] args) {
        operatorString("巨魔叔叔",s -> System.out.println(s),s-> System.out.println(new StringBuilder(s).reverse().toString()));
    }
    private static void operatorString(String name, Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(name);
    }
}
