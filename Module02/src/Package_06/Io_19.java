package Package_06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*文件学生信息到集合*/
public class Io_19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Module02\\student.txt"));
        ArrayList<Student> array = new ArrayList<Student>();

        String line;//读文件的一行一行
        while ((line=br.readLine())!=null){
            String[] strStudent = line.split(",");//要隔开的字符串数组有空格就是空格，有逗号就用逗号
            Student s = new Student();
            s.setName(strStudent[0]);
           // s.setName(strStudent[2]);
            s.setAge(Integer.parseInt(strStudent[1]));
            s.setAddress(strStudent[2]);

            array.add(s);

        }

        for (Student student:array){
            System.out.println(student.getName()+","+student.getAge()+","+student.getAddress());
        }

        br.close();
    }
}
