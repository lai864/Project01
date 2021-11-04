package Package_10;
/*public final getClass():Object类中定义了这个方法，被他的所有子类继承，
方法返回值是一个Class类，此类是Java反射的源头，理解为：可以通过对象反射求出类的名称
Class:描述类的类，Class类也是类，具体类的名称反射得到他的对象，类的整个结果都会被封装在Class对象中
* 具体类，学生类，动物类，new出它的对象，对象得到学生类动物类的信息*/
public class Test_01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的Class对象
        Class c1 = Class.forName("Package_10.Test_01");
        System.out.println(c1);

        //一个类在内存中只存在一个Class对象
        //一个类被加载后，类的整个结果都会被封装在Class对象中
        Class c2 = Class.forName("Package_10.Test_01");
        Class c3 = Class.forName("Package_10.Test_01");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c1==c3);
    }
}

//实体类
class User{
    private int id;
    private int age;

    public User() {
    }

    public User(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }


}
