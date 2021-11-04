package Package_10.Stream;

import java.util.*;
import java.util.stream.Stream;

/*体验Stream流
*   使用Stream流的方式完成过滤操作
*   list.stream().filter(s-> s.startWhit("张")).filter(s->s.length()==3).forEach(System.out::println);
*   直接阅读代码的字面意思即可完美展示无关逻辑方式的语义：生成流；过滤姓张；过滤长度为3，逐一打印，startWhit(“张”)方法输出字符串开头为张的元素
*   Stream流把真正的函数式编程风格引入到Java中*/

/*Stream流的生成方式
*   Stream流的使用
*       生成流
*           通过数据源（集合，数组等）生成流
*           list.stream
*   中间操作
*       一个流后面可以跟随零个或多个中间操作，其目的主要是打开流，做出某种程度的数据过滤/映射，然后返回一个新的流
* 交给下一个操作使用
*           filter()
*   终结操作
*   一个流只能有一个终结操作，当这个操作执行后，流 就被使用光了，无法在操作，所以这必定是流的最后一个操作
*           forEach()*/

/*Stream流的生成方式
*   Stream流的常见生成方式
*       Collection体系的集合可以使用默认方法stream()生成流
*           default Stream<E> stream()
*       Map体系的集合间接的生成流
*       数组可以通过Stream接口的静态方法of(T...values)生成流*/

/*Stream流的常见中间操作
* Stream<T> filter(Predicate predicate):用于对流的数据进行过滤
*   Predicate接口中的方法  boolean test(T t)对给定的参数进行判断，返回一个布尔值
* Stream<T> limit(long maxSize):返回此流中的元素组成的流，截取前指定参数个数的数据
* Stream<T> skip(long n):跳过指定参数个数的数据，返回由该流的剩余元素组成的流
* static<T> Stream<T> concat(Stream a,Stream b):合并a和b两个流为一个流
* Stream<T> distinct():返回由该流的不同元素，（根据Object equals(object)）组成的流
* Stream<T> sorted():返回由此流的元素组成的流，根据自然顺序排列
* Stream<T> sorted(Comparator comparator):返回由该流的元素组成的流，根据提供的Comparator进行排序
* <R> Stream<R> map(Function mapper):返回由给定函数应用了此流的元素的结果组成的流
*       Function接口中的方法   R apply(T,t)
* IntStream mapToInt(ToIntFunction mapper):返回一个IntStream其中包含将给定函数应用于此流的元素的结果
*       IntStream:表示原始int流
*       ToIntFunction接口中的方法     int applyAsInt(T value)*/



/*Stream流的常见终结操作方法
*   void forEach(Consumer action):对此流的每个元素执行此操作
*       Consumer接口中的方法      void accept(T t):对给定的参数执行此操作
*   long count():返回此流中的元素数*/
public class October_01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("张曼玉");
        list.add("张三丰");
        list.add("张敏");
        list.add("王祖贤");
        list.add("巨魔叔叔");

        ArrayList<String> array = new ArrayList<String >();

        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(System.out::println);

        //Collection体系的集合可以使用默认方法stream()生成流
        List<String> list1 = new ArrayList<String>();
        Stream<String> listStream = list1.stream();

        Set<String> set = new HashSet<String>();
        Stream<String> setStream = set.stream();

        //Map体系的集合间接的生成流
        Map<String,Integer> map = new HashMap<String,Integer>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        //数组可以通过Stream接口的静态方法of(T...values)生成流
        String[] strArray = {"Hello","World","Java"};
        Stream<String> strArrayStream = Stream.of(strArray);
        Stream<String> strArrayStream2 = Stream.of("Hello", "World", "Java");
        Stream<Integer> arrStream = Stream.of(12, 3, 6, 9);


        //Stream<T> limit(long maxSize):返回此流中的元素组成的流，截取前指定参数个数的数据
        list.stream().limit(3).forEach(System.out::println);//输出前两，可以历遍集合，数组
        System.out.println(".............");
        // Stream<T> skip(long n):跳过指定参数个数的数据，返回由该流的剩余元素组成的流
        list.stream().skip(2).forEach(System.out::println);
        System.out.println(".............");
        //跳过前两个元素，输出后两元素
        list.stream().skip(2).limit(2).forEach(System.out::println);
        System.out.println(".............");

        //接口静态方法，接口名调用静态方法
        // static<T> Stream<T> concat(Stream a,Stream b):合并a和b两个流为一个流
        Stream<String> stream1 = list.stream().limit(4);
        Stream<String> stream2 = list.stream().skip(3);
//        Stream.concat(stream1,stream2).forEach(System.out::println);
        System.out.println("..................");
        // Stream<T> distinct():返回由该流的不同元素，（根据Object equals(object)）组成的流
        Stream.concat(stream1,stream2).distinct().forEach(System.out::println);
        System.out.println(".............");




        // Stream<T> sorted():返回由此流的元素组成的流，根据自然顺序排列
        list.stream().sorted().forEach(System.out::println);
        //Stream<T> sorted(Comparator comparator):返回由该流的元素组成的流，根据提供的Comparator进行排序
        list.stream().sorted((s1,s2)->{
           int num=s1.length()-s2.length();
           int num2=num==0?s1.compareTo(s2):num;
           return num2;
        }).forEach(System.out::println);
        System.out.println("................");



        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("10");
        list3.add("20");
        list3.add("15");
        list3.add("40");
        list3.add("5");

        //<R> Stream<R> map(Function mapper):返回由给定函数应用了此流的元素的结果组成的流
        //*       Function接口中的方法   R apply(T,t)
        //字符串类型集合转int类型
//        list3.stream().map(s-> Integer.parseInt(s)).forEach(System.out::println);
        list3.stream().map(Integer::parseInt).forEach(System.out::println);
        //* IntStream mapToInt(ToIntFunction mapper):返回一个IntStream其中包含将给定函数应用于此流的元素的结果
        //*       IntStream:表示原始int流
        //*       ToIntFunction接口中的方法     int applyAsInt(T value)
        //字符串类型集合转int类型，mapToInt还能输出int类型集合的总和
        int result = list3.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(result);
        System.out.println("...............");




        /*Stream流的常见终结操作方法
         *   void forEach(Consumer action):对此流的每个元素执行此操作
         *       Consumer接口中的方法      void accept(T t):对给定的参数执行此操作
         *   long count():返回此流中的元素数*/
        list.stream().forEach(System.out::println);//输出集合每一个元素
        //统计元素第一个为“张”的元素，并输出统计结果
        long count = list.stream().filter(s -> s.startsWith("张")).count();
        System.out.println(count);
    }
}
