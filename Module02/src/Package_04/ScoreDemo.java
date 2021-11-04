package Package_04;

import java.util.Comparator;
import java.util.TreeSet;

/*需求：从高到低输出学生成绩，按照姓名，语文成绩，数学成绩*/
public class ScoreDemo {
    public static void main(String[] args) {
        TreeSet<Students> ts = new TreeSet<Students>(new Comparator<Students>() {
            @Override
            public int compare(Students s1, Students s2) {
                //int num =(s1.getChinese()+ s1.getMath())-(s2.getChinese()+ s2.getMath());
                int num=s2.getSum()-s1.getSum();
               int num2= num==0?s1.getChinese()-s2.getChinese():num;
               int num3 = num2==0?s1.getName().compareTo(s2.getName()):num2;//compareTo比较字符串
            return num3;
            }
        });

        Students s1 = new Students("巨魔叔叔",78,90);
        Students s2 = new Students("混世魔王",80,98);
        Students s3 = new Students("王祖贤",78,90);
        Students s4 = new Students("赵云",25,90);
        Students s5 = new Students("李白",90,90);
        Students s6 = new Students("西施",70,90);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        for (Students s:ts){
            System.out.println(s.getName()+","+s.getChinese()+","+s.getMath()+","+s.getSum());
        }

    }
}
