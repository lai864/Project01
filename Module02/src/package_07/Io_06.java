package package_07;

import java.io.*;

/*对象序列化流
*   用对象序列化流序列化了一个对象后，假如我们修改了对象所需的类文件，读取数据会不会出问题
*   会出问题，会抛出异常
*
* 如何解决：
*   给对象加一个serialVersionUID
*       private static final long serialVersionUID
*
* 如果一个对象的某个成员变量的值不想序列化，又该如何实现？
*   给该成员变量加transient关键词修饰，该关键词修饰的成员变量不参加序列化过程*/
public class Io_06 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        read();
        write();
    }

    private static void write() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Module02\\对象序列化流.txt"));
        Object object = ois.readObject();

        Student s= (Student) object;//向下转型
        System.out.println(s.getName()+","+s.getAge());

        ois.close();
    }

    private static void read() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Module02\\对象序列化流.txt"));

        Student s = new Student("巨魔叔叔",30);

        oos.writeObject(s);

        oos.close();
    }
}
