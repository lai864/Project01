package Package_05;

import java.util.HashMap;
import java.util.Map;

/*Map集合概述和使用
*   Map集合概述和使用
*       interface Map<K，V>  k:键的类型   V：值的类型
*       将键映射到值的对象，不能包含重复的键，每个键可以映射最多一个值
* 举例：学生的学号和姓名
*           a001  巨魔叔叔
*           a002  混世魔王
*           a003  王祖贤*/
public class Map_01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("a001","巨魔叔叔");
        map.put("a002","混世魔王");
        map.put("a003","王祖贤");
        map.put("a001","hello");
        System.out.println(map);
    }
}
