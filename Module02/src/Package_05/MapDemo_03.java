package Package_05;
//单列集合放多列
import java.util.*;

/*ArrayList集合储存HashMap元素并遍历
* 需求：创建一个ArrayList集合，储存三个元素，每一个元素都是HashMap,每一个HashMap的键和值都是String，并遍历*/
public class MapDemo_03 {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();
        HashMap<String,String> hm1 = new HashMap<String,String>();

        hm1.put("a001","王祖贤");
        hm1.put("a002","巨魔叔叔");
        hm1.put("a003","混世魔王");

        array.add(hm1);

        HashMap<String,String> hm2 = new HashMap<String,String>();

        hm2.put("江西","吴彦祖");
        hm2.put("湖南","彭于晏");
        hm2.put("b站","小霸王");

        array.add(hm2);

        HashMap<String,String> hm3 = new HashMap<String,String>();

        hm3.put("江西","吉安");
        hm3.put("湖南","长沙");
        hm3.put("b站","学Java");

        array.add(hm3);

        for (HashMap<String, String> hs:array){
            Set<String> keySet = hs.keySet();
            for (String keys:keySet){
                String values = hs.get(keys);
                System.out.println(keys+","+values);
            }
        }
    }
}