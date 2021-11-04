package Package_10;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/*练习反射操作注解*/
public class Test_09 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("Package_10.Student2");

        //通过反射获得注解
        Annotation[] declaredAnnotations = c1.getDeclaredAnnotations();
        for (Annotation declaredAnnotation : declaredAnnotations) {
            System.out.println("all:"+declaredAnnotation);
        }

        //获得注解的value值
        Table table = (Table)c1.getAnnotation(Table.class);//强转，在获得指定注解的Value需要强转，生成类对象，无参，有参构造器及newInstance,需要强转
        String value = table.value();
        System.out.println(value);

        //获得类指定的注解
        Field f = c1.getDeclaredField("id");
        File annotation = f.getAnnotation(File.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());
    }
}

@Table("db_student")
class Student2{
    @File(columnName = "db_name",type = "int",length = 10)
    private String name;
    @File(columnName = "db_age",type = "int",length = 10)
    private int age;
    @File(columnName = "db_id",type = "varchar",length = 10)
    private int id;

    public Student2() {
    }

    public Student2(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Table{
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface File{
    String columnName();
    String type();
    int length();
}