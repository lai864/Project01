package Package_10;
/*类的加载与ClassLoader的理解
*   加载：将class文件字节码内容加载到内存中，并将这些静态数据转换成方法区的运行时数据结构，
* 然后生成一个代表这个类的java.lang.Class对象
*   链接：将java类的二进制代码合并到JVM的运行状态之中的过程
*   初始化：执行构造器<clinit>()方法的过程
*
*
* 类的加载作用
*   类加载的作用：将class文件字节码内容加载到内存中，并将这些静态数据转换成方法区的运行时数据结构，
 * 然后生成一个代表这个类的java.lang.Class对象，作为方法去中类数据的访问入口
 * 类缓存：标准的JavaSE类加载器可以要求查找类，但一旦某个类被加载的类加载器中，它将维持加载（缓存）一段时间
 * 不过JVM垃圾回收机制可以回收这些Class对象
 *
 * 类加载器作用是用来把类（class）装载进内存的，JVM规范定义了如下类型的类加载器
 *  引导类加载器(也是根加载器)：用C++编写的，是JVM自带的类加载器，负责Java平台核心库，用来装载核心类库，该加载器无法直接获取，比如rt.jar
    扩展类加载器：负责jre/lib/ext目录下的jar包或- D java.ext.dirs,指定目录下的jar包装入工作库,比如ext文件
    系统类加载器：负责java-classpath或-D java.class.path所指的目录下的类与jar包装入工作，是最常见的加载器
    * 他们三者自顶向下尝试加载类，自底向上检查类是否已装载*/
public class Test_05 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        //获取系统类加载器的父类加载器-->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        //获取扩展类的父类加载器-->根加载器
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("Package_10.Test_05").getClassLoader();
        System.out.println(classLoader);

        //测试JDK内置类是谁加载的
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        //如何获的系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));


        //双亲委派机制：自底向上检查类是否已装载，只会加载已存在的类，不会加载自己写的类，保证安全性
    }

}
