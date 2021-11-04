package Package_09.Lambda_02;
/*函数式接口作为方法的返回值，
如果方法的返回值是一个函数式接口(Comparator<String>)，我们就可以使用Lambda表达式作为结果返回
* */

/*常用的函数式接口
*   Java8在java.util.function包下预定义了大量的函数式接口供我们使用
* 我们重点学习下面的四个接口
*   Supplier接口
*   Consumer接口
*   Predicate接口
*   Function接口*/


/*Supplier接口
* Supplier<T>:包含一个无参的方法
*   T.get:获得结果
*   该方法不需要参数，它会按照某种实现逻辑(由Lambda表达式实现)返回一个数据
*   Supper<T> 接口也称为生产型接口，如果我们指定了接口的泛型是什么类型，那么接口中的get()方法就会产生什么类型的数据供我们使用*/

/*Consumer接口
* Consumer<T>:包含两个方法
*   void accept(T t):对给定的参数执行此操作
*   default Consumer<T> andThen(Consumer after):返回一个组合的Consumer,依次执行的操作，然后执行after操作
*   Consumer<T>:接口也被称为消费型接口，它消费的数据的数据类型由泛型指定*/

/*Predicate接口
* boolean test(T t)
在给定的参数上计算这个谓词（判断逻辑由Lambda表达式实现）。
参数
t -输入参数
结果
true如果输入参数匹配的谓词，否则 false
*
* default Predicate<T> negate()
返回一个表示该谓词的逻辑否定的谓词。
对应逻辑非
*
* default Predicate<T> and(Predicate<? super T> other):返回一个组合判断，对应短路与
* default Predicate<T> or(Predicate<? super T> other)返回一个组合判断，对应短路或
* Predicate<T>:接口通常用于判断参数是否满足指定的条件 */


/*Function接口
* function<T,R>常用的两个方法
*R apply(T t) ：将此函数应用于给定的参数。
default <V> Function<T,V> andThen(Function<? super R,? extends V> after)
返回一个由功能首次采用该函数的输入，然后将 after函数的结果。
* Function<T,R>接口通常用于对参数进行处理，转换（处理逻辑由Lambda表达式实现），然后返回一个新的值
*/



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("bb");
        array.add("a");
        array.add("ddd");
        array.add("cccc");
        
//        Collections.sort(array);
        Collections.sort(array,getComparator());

        System.out.println(array);
    }

    private static Comparator<String> getComparator(){
        return (s1, s2) ->s1.length()-s2.length();
    }
}
