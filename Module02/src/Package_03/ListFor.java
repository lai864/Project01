package Package_03;

import java.util.ArrayList;
import java.util.List;

/*增强for循环
* 增强for:简化数组和Collection集合的遍历
*   实现Iterator接口的类允许其对象成为增强型for语句的目标
*   它是JDK5之后出现的，其内部原理是一个iterator迭代器
*
* 增强for的格式
*   格式：
* for（元素数据类型变量名：数组或者Collection集合）{
*       //在此处使用变量即可，该变量就是元素
*       }
*
* 范例：
* int[] arr = {1,2,3,4,5}；
*   for (int i:arr){
*       System.out.println(i)
* }*/
public class ListFor {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i:arr){
            System.out.println(i);
        }
        String[] strArray = {"hello","world","java"};
        for (String s:strArray){
            System.out.println(s);
        }

        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("hello");
        for (String s2:list){
            System.out.println(s2);
        }

//        for (String s:list){
//            if (s.equals("java")){
//                list.add("world");//内部原理是一个Iterator迭代器
//            }
//        }
    }
}
