package Package_06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*集合到文件改进版，加上年龄，地址*/
public class Io_18 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("Module02\\student.txt"));
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("巨魔叔叔",12,"宜春学院");
        Student s2 = new Student("混世魔王",32,"宜春学院");
        Student s3 = new Student("王祖贤",21,"宜春学院");

        array.add(s1);
        array.add(s2);
        array.add(s3);

        for (Student student:array) {
            StringBuilder sb = new StringBuilder();
            sb.append(student.getName()).append(",").append(student.getAge()).append(",").append(student.getAddress());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();

        }
        bw.close();
    }
}
