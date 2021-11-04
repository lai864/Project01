package Package_10.Annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//子定义注解
public class AnnotationTest {
    //注解可以显示赋值，如果没有默认值，我们必须给注解赋值
    @MyAnnotation2(name = "巨魔叔叔")
    @MyAnnotation3("b站小霸王")//如果只有一个参数成员，一般参数名为value,对比name等,不用谢变量名
    public void test(){

    }
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    //注解的参数：参数类型+参数名（）；
    String name() default "";//给默认值为空
    int age() default 0;
    int id() default -1;//如果默认值为负一，代表不存在，如果找不到就返回负1

    String[] school() default {"混世魔王","王祖贤"};
}

@interface MyAnnotation3{
    String value();////如果只有一个参数成员，一般参数名为value
}
