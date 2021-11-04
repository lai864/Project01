package Package_09.Lambda_02;

import java.util.function.Predicate;

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
public class PredicateDemo {
    public static void main(String[] args) {
      boolean result =  checkString("HelloWorld",s ->s.length()>8);
        System.out.println(result);



      boolean result2 = checkString("HelloWorld",s->s.length()>8,s->s.length()<15);
        System.out.println(result2);

        boolean result3 = checkString("Hello",s->s.length()>8,s->s.length()<15);
        System.out.println(result3);
    }

    private static boolean checkString(String s, Predicate<String> pre){
        //boolean test(T t)
//        return  pre.test(s);//返回逻辑值

        //default Predicate<T> negate()
        return pre.negate().test(s);//逻辑非
    }

    private static boolean checkString(String s,Predicate<String> pre1,Predicate<String> pre2){
        //default Predicate<T> and(Predicate<? super T> other):返回一个组合判断，对应短路与
//        return pre1.and(pre2).test(s);
        //default Predicate<T> or(Predicate<? super T> other)返回一个组合判断，对应短路或
        return pre1.or(pre2).test(s);
    }
}
