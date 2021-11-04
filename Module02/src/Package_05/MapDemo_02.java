package Package_05;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*HashMap集合储存学生对象并遍历
* 并保持键的唯一性
* 键相同，值覆盖*/
public class MapDemo_02 {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<Student, String>();

        Student s1 = new Student("巨魔叔叔",37);
        Student s2 = new Student("混世魔王", 27);
        Student s3 = new Student("王祖贤", 18);
        Student s4 = new Student("巨魔叔叔",37);

        map.put(s1,"北京");
        map.put(s2,"a002");
        map.put(s3,"a003");
        map.put(s4,"西安");

        Set<Student> keySet = map.keySet();
        for (Student keys:keySet){
            String values = map.get(keys);
            System.out.println(keys.getName()+","+keys.getAge()+","+values);
        }
        System.out.println(".........");


        Set<Map.Entry<Student, String>> entrySet = map.entrySet();
        for (Map.Entry<Student, String> me:entrySet){
            Student key = me.getKey();
            String value = me.getValue();
            System.out.println(key.getName()+","+key.getAge()+","+value);
        }
    }
}
