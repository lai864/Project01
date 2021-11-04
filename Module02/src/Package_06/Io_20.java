package Package_06;



import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*集合到文件升级版
* 按总成绩排序*/
public class Io_20 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("Module02\\score.txt"));
        TreeSet<Students> ts = new java.util.TreeSet<Students>(new Comparator<Students>() {
            @Override
            public int compare(Students s1, Students s2) {
                int num = s2.sum()-s1.sum();
                int num2 = num==0?s2.getChinese()-s1.getChinese():num;
                int num3 = num2==0?s2.getMath()-s1.getMath():num2;
                int num4 = num3==0?s2.getName().compareTo(s1.getName()):num3;
                return num4;
            }
        });

     /*   Students s1 = new Students("巨魔叔叔",70,80,90);
        Students s2 = new Students("混世魔王",60,90,100);
        Students s3 = new Students("王祖贤",900,98,97);
        Students s4 = new Students("b站小霸王",100,100,1000);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

      */
        for (int i = 0; i < 4; i++) {
            Scanner sc = new Scanner(System.in);

            //输入学生姓名
            System.out.println("请输入学生姓名");
            String name = sc.nextLine();
            System.out.println("请输入语文成绩");
            int chinese = sc.nextInt();
            System.out.println("请输入数学成绩");
            int math = sc.nextInt();
            System.out.println("请输入英语成绩");
            int english = sc.nextInt();

            Students s = new Students();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);

            ts.add(s);
        }


        for (Students student:ts){
            StringBuilder sb = new StringBuilder();
            sb.append(student.getName()).append(",").append(student.getChinese()).append(",").append(student.getMath()).append(",").append(student.getEnglish()).append(",").append(student.sum());

            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
