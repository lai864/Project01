package Package_03;
/*集合进阶（Collection(单列集合),List(可重复),Set(集合数据不重复),泛型，Map(多列集合),Collections）*/
//List等是接口，ArrayList，LinkedList属于List,是实现类,接口不能实例化和创建对象



/*集合知识回顾
* 集合类的特点：提供一种储存空间可变的储存模型，储存的数据容量可以随时发生改变*/


import java.util.ArrayList;
import java.util.Collection;

/*Collection集合概述和使用
* Collection集合概述
*   是单例集合的顶层接口，它表示一组对象，这些对象也称为Collection的元素
*   JDK不提供此接口的任何直接实现类，它提供更具体的子接口（如Set何List）实现
*
* 创建Collection集合对象
*   多态的方方式
*   具体的实现类ArrayList*/
public class Collection_01 {
    public static void main(String[] args) {
        /*创建Collection集合对象
         *   多态的方方式
         *   具体的实现类ArrayList*/

        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("world");
        c.add("Java");

        System.out.println(c);
    }
}
