package package_07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*对象反序列化流：ObjectInputStream
ObjectInputStream反序列化先前使用ObjectOutputStream编写的原始数据和对象
 *
 构造方法：
 ObjectInputStream(InputStream in) ：创建一个对象输入流读取从指定的输入流。

  反序列化的方法
    Object ObjectRead():从ObjectInputStream读取一个对象*/
public class Io_05 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Module02\\对象序列化流.txt"));
        Object object = ois.readObject();

        Student s= (Student) object;//向下转型
        System.out.println(s.getName()+","+s.getAge());

        ois.close();
    }
}
