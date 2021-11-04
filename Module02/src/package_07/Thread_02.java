package package_07;

import java.util.*;

/*2.线程同步
*   StringBuffer
*   线程安全，可变的字符序列
*   从版本JDK5开始被StringBuilder替代，通常应该使用StringBuilder类，因为它支持所有相同的操作
* 但是他更快，因为它不执行同步
*
*   Vector
*   从Java2平台v1,2开始，该类改进了List接口，使其成为Java Collections Framework的成员，与新的集合实现
* 不同，Vector被同步，如果不需要线程安全的实现，建议使用ArrayList代替Vector
*
    hashtable
    该类实现了一个哈希表，它将键映射到值，任何非null对象都可以作为键和值
    * 从Java平台v1,2开始，该类进行了改进，实现了Map接口，使其成为Java Collections Framework的成员*
    * 与新的集合实现不同，Hashtable被同步，如果不需要线程安全的实现，建议使用HashMap代替Hashtable
    *
    * 线程安全的类
    *   StringBuffer
    *     Vector
    *   Hashtable
    * 后两个不怎么在线程里使用，被替代
    * static <T> List<T> synchronizedList(List<T> list) ：返回由指定列表支持的同步（线程安全）列表。
    static <K,V> Map<K,V> synchronizedMap(Map<K,V> m) ：返回由指定的Map支持的同步（线程安全）Map。
    static <T> Set<T> synchronizedSet(Set<T> s) ：返回一个由指定集合支持的同步（线程安全）集。  */
public class Thread_02 {
    public static void main(String[] args) {
        //static <T> List<T> synchronizedList(List<T> list) ：返回由指定列表支持的同步（线程安全）列表。
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
        // static <K,V> Map<K,V> synchronizedMap(Map<K,V> m) ：返回由指定的Map支持的同步（线程安全）Map。
        Map<String, String> map = Collections.synchronizedMap(new HashMap<String, String>());
        //static <T> Set<T> synchronizedSet(Set<T> s) ：返回一个由指定集合支持的同步（线程安全）集。
        Set<Object> set = Collections.synchronizedSet(new HashSet<>());
    }
}
