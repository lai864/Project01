package Package_10;
/*动态语言，：是一类运行时可以改变其结构的语言
* 静态语言：与之相对，Java利用反射机制获得类似动态语言的特性
*
*
* Reflection(反射)是Java被视为动态语言的关键，反射机制允许程序在执行期借助于Reflection API获得
* 任何类的内部信息，并能直接操作任意对象的内部属性及方法
*       范例：Class c = Class.forName("java.lang.String")
*
* 加载完类之后，在堆内存的方法区中就产生了一个Class类型的对象，（一个类只有一个Class对象），这个对象就包含
* 了完整的类的结构信息，我们可以通过这个对象看到类的结构。这个对象就像一面镜子，透过这个镜子看到类的结构，所以，
* 我们形象的称之为：反射
*
*   正常方式：引入需要的”包类“名称 - 通过new实例化 -获得实例对象
*
*   反射方式“实例化对象 - getClass()方法 - 得到完整的”包类“名称
*
*
* Java反射机制提供的功能
*   在运行时判断任意一个所属的类
*   在运行时构造任意一个类的对象
*   在运行时判断任意一个类所具有的成员变量和方法
*   在运行时获取泛型信息
*   在运行时调用任意一个对象的成员变量和方法
*   在运行时处理注解
*   生成动态代理
*   ................
*
*
* Java反射优点和缺点
*   优点
* 可以实现动态创建对象和编译，体现出很大的灵活性
*
*   缺点
* 对性能有影响，使用反射基本上是一种解释操作，我们可以告诉JVM，我们希望
* 做什么并且满足我们的要求，这类操作总是慢于直接执行相同的操作
*
*
* 反射相关的主要API
*   java.lang.Class:代表一个类
*   java.lang.reflect.method:代表类的方法
*   java.lang.reflect.Field:代表类的成员变量
*   java.lang.reflect.Constructor:代表类的构造方法*/
public class October_01 {
}
