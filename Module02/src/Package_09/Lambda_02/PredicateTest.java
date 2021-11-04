package Package_09.Lambda_02;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        String[] strArray = {"巨魔叔叔,34","混世魔王,36","猫咪,18"};
       ArrayList<String> arrayList= getString(strArray,s ->s.split(",")[0].length()<3,
                s->Integer.parseInt(s.split(",")[1])<33);
        System.out.println(arrayList);
    }

    //方法永远是方法，作用接收实参，用语句实现需求，不要把main方法里的调用语句与写的方法分开，调用方法可以给实参，也可以给Lambda表达式
    //无参方法，即消费者，都是在方法里输出结果在控制台，main方法需要调用无参方法。
    //带参方法，即消费者，都是返回一个值给main方法的调用方法，定义接收，在写输出语句
    //main方法也可以传值给写的方法，//要输出，就会有接收
    private static ArrayList<String> getString(String[] strArray, Predicate<String> pre1, Predicate<String> pre2){
        ArrayList<String> array = new ArrayList<String>();
        for (String str:strArray){
            if (pre1.and(pre2).test(str)){
                array.add(str);
            }
        }
        return array;
    }
}
