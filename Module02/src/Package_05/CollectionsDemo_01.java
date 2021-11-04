package Package_05;

import com.sun.xml.internal.stream.events.NamedEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*ArrayList储存学生对象并排序*/
public class CollectionsDemo_01 {
    public static void main(String[] args) {
        ArrayList<Students> array = new ArrayList<Students>();

        Students s1 = new Students("巨魔叔叔",18);
        Students s2 = new Students("混世魔王",16);
        Students s4 = new Students("b站小霸王",18);
        Students s3 = new Students("王祖贤",24);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        //排序：sort(List<T> list, Comparator<? super T> c)
        //根据指定的比较器指定的顺序对指定的列表进行排序。
        Collections.sort(array, new Comparator<Students>() {
            @Override
            public int compare(Students s1, Students s2) {
                int num = s1.getAge()-s2.getAge();
                int num2 = num==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

        for (Students students:array){
            System.out.println(students.getName()+","+students.getAge());
        }

    }
}
