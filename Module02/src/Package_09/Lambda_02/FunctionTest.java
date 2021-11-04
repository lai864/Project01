package Package_09.Lambda_02;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        String s ="王祖贤,30";
        printInt(s,ss->Integer.parseInt(ss.split(",")[1]),i->String.valueOf(i+70));
    }
    private static void printInt(String s, Function<String,Integer> fun, Function<Integer,String> fun2){
        String s1 = fun.andThen(fun2).apply(s);
        System.out.println(s1);
    }
}
