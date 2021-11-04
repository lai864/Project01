package Package_10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*有了Class对象能做什么？
* 创建类的对象，调用Class对象的newInstance()方法
*   类必须有一个无参数的构造器
*   类的构造器的访问权限需要足够
* 没有无参构造器，只要在操作的时候明确的调用类中的构造器
* 并将参数传递进去，才可以实现实例化操作*/
public class Test_07 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
       //获得Class对象
        Class c1 = Class.forName("Package_10.User");

        //构造一个对象（无参构造器构造一个对象）
        User user = (User)c1.newInstance();
        System.out.println(user);

        //通过构造器获得对象（有参构造器构造一个对象），属性有了，方法不用了
        Constructor constructor = c1.getDeclaredConstructor(int.class, int.class);
        User user2 = (User) constructor.newInstance(18, 133);
        System.out.println(user2);

        //通过反射调用普通方法
        User user3 = (User)c1.newInstance();

        //同反射获取一个方法
        Method setAge = c1.getDeclaredMethod("setAge", int.class);
        //invoke:激活的意思
        //（对象，“方法的值”）
        setAge.invoke(user3,10);
        System.out.println(user3.getAge());

        //通过反射操作属性
       User user4 = (User) c1.newInstance();
        Field id = c1.getDeclaredField("id");

        //不能直接操作安全检测，我们需要关闭程序的安全检测，属性或者方法的setAccessible(true)
        id.setAccessible(true);//id由private修饰
        id.set(user4,191);
        System.out.println(user4.getId());
    }
}
