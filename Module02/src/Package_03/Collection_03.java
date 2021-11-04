package Package_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*Collection集合的遍历
 *   Iterator:迭代器，集合的专用遍历方式
 *       Iterator<E>iterator():返回此集合中元素的迭代器，通过集合的iterator()方法得到
 *       迭代器是通过集合的iterator()方法得到的，所以我们说它是依赖于集合而存在的
 *
 * Iterator中的常用方法
 *   E next():返回迭代中的下一个元素
 *   boolean hasNext():如果迭代具有更多元素，则返回true*/
public class Collection_03 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("world");
        c.add("Java");

        //Iterator<E>iterator():返回此集合中元素的迭代器，通过集合的iterator()方法得到
        Iterator<String> it = c.iterator();
        /*
        public Iterator<E> iterator() {
                return new Itr();
           }

           private class Itr implements Iterator<E> {
                ...
            }
       */

        //E next():返回迭代中的下一个元素
        /*
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());//NoSuchElementException:表示被请求的元素不存在
         */


        //boolean hasNext():如果迭代具有更多元素，则返回true
       /* if(it.hasNext()){
            System.out.println(it.next());
        }
        */
        //用while循环改进
        while(it.hasNext()){
//            System.out.println(it.next());
            String s = it.next();
            System.out.println(s);
        }
    }
}