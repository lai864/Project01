package Package_02;
/*基本类型包装类
*   自动装箱和拆箱
* 装箱：把基本数据类型转换为对应的包装类型
* 拆箱：把包装类类型转换为对应的基本数据类型
*
* Integer i=100;自动装箱
* i+=100; //i = i+200; i+200自动装箱，   i = i+200;是自动拆箱
*
* 注意：在使用包装类类型的时候，如果做操作，最好先判断是否为null
* 我们推荐的是，只要是对象，在使用前就必须进行不为null的判断*/
public class SeptemberTwentyFive_01 {
    public static void main(String[] args) {
        //装箱：把基本数据类型转换为对应的包装类型
        //Integer ii= Integer.valueOf(100);
        Integer i = 100;//Integer.valueOf(100)
        System.out.println(i);

        //拆箱：把包装类类型转换为对应的基本数据类型
        if(i!=null) {  //i是包装类型，不是基本类型，要判断是否为null
            i += 200;
            System.out.println(i);
        }
    }
}
