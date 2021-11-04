package package_07;

import java.util.Properties;
import java.util.Set;

/*特殊操作流
* Properties作为Map集合的使用*/

/*Properties作为集合的特有方法
* setProperty(String key, String value): 设置集合的键和值，都是String类型，调用方法 put Hashtable。
* String getProperty(String key):使用此属性列表中指定的键搜索属性
* stringPropertyNames() :在这个属性列表中返回一组不可修改的键集，其中键和它的对应值是字符串
 */
public class Io_07 {
    public static void main(String[] args) {
        Properties prop = new Properties();//使用Object类

        prop.put("a0001","巨魔叔叔");
        prop.put("a0002","混世魔王");
        prop.put("a0003","王祖贤");

        Set<Object> keySet = prop.keySet();
        for (Object key:keySet) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }

        System.out.println("...................");

            /*Properties作为集合的特有方法
             * setProperty(String key, String value):
             * 设置集合的键和值，都是String类型，调用方法 put Hashtable。*/
           prop.setProperty("a0004","b站小霸王");
           prop.setProperty("a0005","b站叔叔");
           prop.setProperty("a0006","法外狂徒");

           // String getProperty(String key):使用此属性列表中指定的键搜索属性
            System.out.println(prop.getProperty("a0004"));

            //stringPropertyNames() :在这个属性列表中返回一组不可修改的键集，其中键和它的对应值是字符串
        Set<String> propertyNames = prop.stringPropertyNames();
        for (String keys:propertyNames){
            String values = prop.getProperty(keys);
            System.out.println(keys+","+values);
        }


    }
}
