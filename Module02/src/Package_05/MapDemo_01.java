package Package_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*HashMap集合储存学生对象并遍历*/
public class MapDemo_01 {
    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<String, Student>();

        Student s1 = new Student("巨魔叔叔", 30);
        Student s2 = new Student("混世魔王", 27);
        Student s3 = new Student("王祖贤", 18);


        map.put("a001", s1);
        map.put("a002", s2);
        map.put("a003", s3);


        //方法一
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Student student = map.get(key);
            System.out.println(key + "," + student.getName() + "," + student.getAge());
        }
        System.out.println(".......");


        //方法二
        Set<Map.Entry<String, Student>> entrySet = map.entrySet();
        for (Map.Entry<String, Student> me : entrySet) {
            String meKey = me.getKey();
            Student meValue = me.getValue();
            System.out.println(meKey + "," + meValue.getName() + "," + meValue.getAge());
        }
    }
}

