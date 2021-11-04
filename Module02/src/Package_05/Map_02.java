package Package_05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Map集合的基本功能
*   V put（key,V value）添加元素
* V remove(Object key):根据键删除键值对元素
* void char():移除所有键值对元素
* boolean containsKey(Object key):判断集合是否包含指定的键
* boolean containsValue(Object value):判断集合是否包含指定的值
* boolean isEmpty():判断集合是否为空
* int size():集合的长度，也就是集合中键值对的个数*/
public class Map_02 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("a001","巨魔叔叔");
        map.put("a002","混世魔王");
        map.put("a003","王祖贤");

        //V remove(Object key):根据键删除键值对元素
        map.remove("a001");

        //void char():移除所有键值对元素
//        map.clear();

        //boolean containsKey(Object key):判断集合是否包含指定的键
        System.out.println(map.containsKey("a002"));

        // boolean containsValue(Object value):判断集合是否包含指定的值
        System.out.println(map.containsValue("王祖贤"));

        //boolean isEmpty():判断集合是否为空
        System.out.println(map.isEmpty());

        //int size():集合的长度，也就是集合中键值对的个数
        System.out.println(map.size());

        System.out.println(map);
        }
}
