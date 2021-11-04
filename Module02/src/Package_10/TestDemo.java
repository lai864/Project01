package Package_10;
//强转，在获得指定注解的Value需要强转，生成类对象，无参，有参构造器及newInstance,需要强转
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        User user = new User();

        Class<?> c1 = Class.forName("Package_10.User");
        Class<User> c2 = User.class;
        Class<? extends User> c3 = user.getClass();

        Constructor<?> declaredConstructor = c1.getDeclaredConstructor(int.class, int.class);
        User user1 = (User) declaredConstructor.newInstance(10, 18);
        System.out.println(user1);

        Method setAge = c1.getDeclaredMethod("setAge", int.class);
        setAge.invoke(user,18);
        System.out.println(user.getAge());

        Field id = c1.getDeclaredField("id");

        id.setAccessible(true);
        id.set(user,234);
        System.out.println(user.getId());
    }
}
