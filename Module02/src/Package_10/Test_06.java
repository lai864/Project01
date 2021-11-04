package Package_10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*获取类运行时的完整结构
* 通过反射获取运行时类的完整结构
* Field,Method,Constructor,Superclass,Annotation
*
* 实现的全部接口
* 所继承的父类
* 全部的构造器
* 全部的方法
* 全部的Filed
* 注解
  ..............*/
public class Test_06 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        //得到类对象
        Class c1 = Class.forName("Package_10.User");

        //获得类的名字
        System.out.println(c1.getName());//获得包名+类名
        System.out.println(c1.getSimpleName());//获得类名

        //全部Filed，属性,这是一个数组需要历遍输出
        Field[] fields = c1.getFields();//只能找到public属性
        System.out.println(fields);

        Field[] declaredFields = c1.getDeclaredFields();//能获得全部属性
        for (Field field : declaredFields) {
            System.out.println(field);
        }

        Field age = c1.getDeclaredField("age");//获得指定属性
        System.out.println(age);


        Method[] methods = c1.getMethods();//得到public方法，包括父类
        System.out.println(methods);

        Method[] declaredMethods = c1.getDeclaredMethods();//得到所有方法，不包括父类
        System.out.println(declaredMethods);

        //获得指定方法
        //重载，方法名相同，参数不同
        Method getAge = c1.getMethod("getAge", null);
        Method setAge = c1.getMethod("setAge", int.class);
        System.out.println(getAge);
        System.out.println(setAge);


        Constructor[] constructors = c1.getConstructors();//public
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        constructors = c1.getDeclaredConstructors();//全部
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        //获得指定的构造器
        Constructor constructor = c1.getConstructor(int.class,int.class);
        System.out.println(constructor);

    }
}
