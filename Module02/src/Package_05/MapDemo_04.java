package Package_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*与上一个案例相反
* HashMap集合储存ArrayList元素并遍历*/
public class MapDemo_04 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
        ArrayList<String> sgyy = new ArrayList<String>();

        sgyy.add("赵云");
        sgyy.add("刘备");

        hm.put("三国演义",sgyy);

        ArrayList<String> sfz = new ArrayList<String>();

        sfz.add("武松");
        sfz.add("宋江");

        hm.put("水浒传",sfz);

        ArrayList<String> xyj = new ArrayList<String>();

        xyj.add("孙悟空");
        xyj.add("猪八戒");

        hm.put("西游记",xyj);

        Set<String> keySet = hm.keySet();
        for (String keys:keySet){
            ArrayList<String> values = hm.get(keys);
            for (String s:values){
                System.out.println(keys+","+s);
            }
        }
    }
}
