package Package_09.Lambda_02;

import java.util.function.Function;

/*Function接口
* function<T,R>常用的两个方法
*R apply(T t) ：将此函数应用于给定的参数。
default <V> Function<T,V> andThen(Function<? super R,? extends V> after)
返回一个由功能首次采用该函数的输入，然后将 after函数的结果。
* Function<T,R>接口通常用于对参数进行处理，转换（处理逻辑由Lambda表达式实现），然后返回一个新的值
*/
public class FunctionDemo {
    public static void main(String[] args) {
        convert("6",s->Integer.parseInt(s));

        convert(10,i->String.valueOf(i+12));

        convert("4",s->Integer.parseInt(s),i->String.valueOf(i+7));
    }

    //String类型转int类型
    private static void convert(String s, Function<String,Integer> fun){
        Integer i = fun.apply(s);
        System.out.println(i);
    }
    //int类型加一个数转String类型
    private static void convert(Integer i,Function<Integer,String> fun){
        String s = fun.apply(i);
        System.out.println(s);

    }
    //String转int,加一个数，int转String，输出
    private static void convert(String s,Function<String,Integer> fun1,Function<Integer,String> fun2){
//        Integer i = fun1.apply(s);//要输出，就会有接收
//        String ss = fun2.apply(i);//要输出，就会有接收
        String ss = fun1.andThen(fun2).apply(s);//要输出，就会有接收
        System.out.println(ss);
    }
}
