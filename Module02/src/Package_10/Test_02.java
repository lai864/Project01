package Package_10;
/*获取Class类的实例
*   如果已知具体的类，通过类的class属性获取，该方法最为安全可靠，程序性能最高
*       Class clazz = Person.class;
*   已知某个类的实例，调用该实例的getClass()方法获取Class对象
*       Class clazz = person.getClass();
*   已知一个类的全类名，且该类在类路径下，可通过Class类的静态方法forName()获取
*   肯抛出ClassNotFoundException
*       Class clazz = Class.forName("demo01.Student")
*
*   内置基本数据类型可以直接用类.Type
*   还可以利用ClassLoader我们之后讲解*/

//测试Class类的创建方式有哪些
public class Test_02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println(person.name);

        // 方式一：通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1);

        //方式二：forName获得
        Class c2 = Class.forName("Package_10.Student");
        System.out.println(c2);

        //方式三：通过类名.class获得
        Class<Student> c3 = Student.class;
        System.out.println(c3);

        //方式：基本类型的包装类
        Class c4 = Integer.TYPE;
        System.out.println(c4);

        //获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);

    }
}

class Person{
    public String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person{
    public Student(){   //无参构造方法
        this.name ="学生"; //覆盖
    }
}

class Teacher extends Person {
    public Teacher(){
        this.name = "老师";
    }
}

