package Package_06;
/*集合概述
*   集合类的特点：提供一种储存空间可变的储存模型，储存的数据容量可以发生该变
*   集合类有很多，目前我们先学习一个：ArrayList
*
*   ArrayList<E>
        可调整大小的数组实现
        * <E>:是一种特殊的数据类型，泛型  E是类
        *
      怎么用
      * 在出现E的地方我们使用引用数据类型替代即可
      * 举例：ArrayList<String>,ArrayList<Student>*/


import java.util.ArrayList;

/*ArrayList构造方法和添加方法
*   public ArrayList():创建一个空的集合对象
*   public boolean add(E e):将指定元素追加到此集合的末尾
*   public void add(int index,E element):在此集合的指定位置插入指定的元素*/
public class SeptemberEighteen_09 {
    public static void main(String[] args) {


        //public ArrayList():创建一个空的集合对象
        ArrayList<String> array = new ArrayList<>();

        //public boolean add(E e):将指定元素追加到此集合的末尾
        //System.out.println(array.add("hello"));

        array.add("Hello");
        array.add("World");
        array.add("Java");

        //public void add(int index,E element):在此集合的指定位置插入指定的元素
        array.add(1,"Javase");
       // array.add(3,"Javaee");
        //IndexOutOfBoundsException
        //array.add(4,"Javaee");


        //输出集合
        System.out.println("array:"+array);

    }
}
