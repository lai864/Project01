package Package_03;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/*可变参数的使用
* Arrays工具类中有一个静态方法：
*   public static <T> List<T> asList(T...a):方法由指定数组支持的固定大小的列表
*   返回的集合不能做增删操作，可以做修改操作
*
* List接口中有一个静态方法：
*   public static <E> List<E> of(E...elements):返回包含任意数量元素的不可变列表
*   返回的集合不能做增删改操作
*
* Set接口有一个静态方法：
*   public static<E> Set<E> of(E...elements):返回一个包含任意数量元素的不可变集合
*   在给元素时，不能给重复的元素
*   返回的集合不能做增删操作，没有修改的方法*/
public class Generic_03 {
    public static void main(String[] args) {
        //返回的集合不能做增删操作，可以做修改操作
//        List<String> list = Arrays.asList("hello", "world", "java");
//        list.add("javaee");
//        list.remove("hello");
//        list.set(1,"javaee");
//        System.out.println(list);
//        System.out.println(".....");

        //返回的集合不能做增删改操作
//       List<String> list = List.of("hello", "world", "java");
//        list.add("javaee");
//        list.remove("hello")
//        list.set(1,"javaee");


        //返回的集合不能做增删操作，没有修改的方法
//        Set<String> set = Set.of("hello", "world", "java");
        //list.add("javaee");
//        list.remove("hello")


    }
}
