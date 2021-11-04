package Package_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Map集合的遍历（方法二）
*   获取所有键值对对象的集合
* set<Map.Entry<K,V>> entrySet():获取所有键值对对象的集合
* 用增强for得到每一个对象Map.Entry
* 根据键值对对象获取键和值
*   用getKey()获取键
*   用getValue()获取值*/
public class Map_05 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("a001","巨魔叔叔");
        map.put("a002","混世魔王");
        map.put("a003","王祖贤");

        // 获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> me:entrySet){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }
    }
}
