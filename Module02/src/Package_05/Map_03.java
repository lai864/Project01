package Package_05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Map集合的获取功能
* V get(Object Key):根据键获取值
* Set<K> keySet():获取所有键的集合
* Collection<V> values():获取所有值的集合
* Set<Map.Entry<K,V>>entrySet():获取所有键值对对象的集合*/
public class Map_03 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("a001","巨魔叔叔");
        map.put("a002","混世魔王");
        map.put("a003","王祖贤");

        // V get(Object Key):根据键获取值
        System.out.println(map.get("a001"));

        //Set<K> keySet():获取所有键的集合
        Set<String> keys = map.keySet();
        for (String s:keys){
            System.out.println(s);
        }
        System.out.println(keys);

        //Collection<V> values():获取所有值的集合
        Collection<String> values = map.values();
        for (String s:values){
            System.out.println(s);
        }
        System.out.println(values);
    }
}
