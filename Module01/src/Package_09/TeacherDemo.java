package Package_09;
/*static
 *   static关键字是静态的意思，可以修饰成员方法，成员变量
 *
 *   static修饰的特点
 *       被类的所有对象共享
 *           这也是我们判断是否使用静态关键字的条件
 *       可以通过类名调用
 *           当然也可以通过对象名调用
 *           推荐使用类名调用*/
public class TeacherDemo {
    public static void main(String[] args) {

        Teacher.university="宜春学院";


        Teacher t= new Teacher();
        t.name="林青霞";
        t.age=30;
      //  t.university="宜春学院";
        t.show();

        Teacher t2 = new Teacher();
        t.name="巨魔叔叔";
        t.age=20;
      //  t.university="宜春学院";
        t.show();
    }
}
