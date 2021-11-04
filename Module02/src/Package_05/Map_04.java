package Package_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Map集合的遍历(方法一)
*   获取键的集合：keySet()方法
*   历遍每一个键：增强for
*   get(Object key)方法*/
public class Map_04 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("aoo1","巨魔叔叔");
        map.put("a002","混世魔王");
        map.put("a003","王祖贤");


        Set<String> keySet = map.keySet();
        for (String keys:keySet){
            String values = map.get(keys);
            System.out.println(keys+","+values);
        }
    }
}
