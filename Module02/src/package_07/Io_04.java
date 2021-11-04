package package_07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*特殊操作流：
对象序列化流：ObjectOutputStream
一个对象写入原始数据类型和java对象图的一个输出流。对象可以读取（重组）用ObjectInputStream。
通过使用流的文件，可以实现对对象的持久存储。如果流是一个网络套接字流，对象可以被重新在另一个主机上或在另一个进程中。
*
 构造方法
 ObjectOutputStream(OutputStream out) ：创建一个对象写入到指定的输出流。

 序列化对象的方法
 writeObject(Object obj) ：写入指定的对象的对象。

  注意：
    一个对象想要实现被实例化，该对象所属的类必须实现Serializable接口
    Serializable是一个标记接口，实现该接口，不需要重写任何方法*/
public class Io_04 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Module02\\对象序列化流.txt"));

        Student s = new Student("巨魔叔叔",30);

        oos.writeObject(s);

        oos.close();
    }
}
