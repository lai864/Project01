package Package_10.Annotation;
/*什么是注解
*   Annotation的作用
* 不是程序本身，可以对程序作出解释，（这一点和注释(comment)没什么区别
* 可以被其他程序（比如：编译器等）读取
*
* Annotation的格式：
*   注解是以"@注释名"在代码中存在的，还可以添加一些参数值，例如：@SuppressWarning(value="unchecked")
*
* Annotation在哪里使用
*   可以附加在package,class,method,filed等上面，相当于给他们添加了额外的辅助信息
* 我们可以通过反射机制编程实现对这些元数据的访问
*
* 内置注解
* @Override:定义在java.lang.Override中，此注解只适用于修饰方法，表示一个方法声明打算重写超类中的另一个方法声明
* @Deprecated:定义在java.lang.Deprecated中，此注解可以用于修饰方法，属性，类，表示不鼓励程序员使用这样的元素，
* 通常是它很危险或者存在更好的选择
* @SuppressWarnings:定义在java.lang.SuppressWarnings中，用来抑制编译时的警告信息
* 与前两个注解有所不同，你需要添加一个参数才能正确使用，这些参数都是已经定义好了的，我们选择性的使用就好了
* 范例：@SuppressWarnings("all")
*      @SuppressWarnings("unchecked")
*        .................
*
*
* 元注解
* 元注解的作用就是负责注解其他注解，java定义了4个标准的meta-annotation类型，他们被用来
* 提供对其他annotation类型作说明
* 这些类型和他们所支持的类在java.lang.annotation包中可以找到(@Target,@Retention,@Documented.@Inherited)
*
* @Target:用于描述注解的使用范围(即：被描述的注解可以用在什么地方)
*
* @Retention:表示需要在什么级别保存该注解信息，用于描述注解的生命周期
*   (SOURCE<CLASS<RUNTIME)
*
*   @Document:说明该注解将被包含在javadoc中
*
*   @Inherited:说明子类可以继承父类中的该注解
*
*
* 自定义注解
* 使用@Interface自定义注解时，自动继承了java.lang.annotation接口
*
* 分析：
*   @Interface用来声明一个注解，格式：public @interface 注解名（定义内容）
*   其中每一个方法实际是声明了一个配置参数
*   方法的名称就是参数的名称
*   返回值类型就是参数的类型（返回值只能是基本类型Class,String,enum）
*   可以通过default来声明参数的默认值
*   如果只有一个参数成员，一般参数名为value
*   注解元素必须要有值，我们定义注解元素时，经常使用空字符串0作为默认值
* */

import java.lang.annotation.*;

//测试元注解
@MyAnnotation
public class October_01 {

    public void show(){

    }
}

//定义一个注解
// @Target:用于描述注解的使用范围(即：被描述的注解可以用在什么地方)
@Target(value = {ElementType.METHOD,ElementType.TYPE})

// @Retention:表示需要在什么级别保存该注解信息，用于描述注解的生命周期
//*   (SOURCE<CLASS<RUNTIME)
@Retention(value = RetentionPolicy.RUNTIME)

//@Document:说明该注解将被包含在javadoc中
@Documented

// @Inherited:说明子类可以继承父类中的该注解
@Inherited
@interface MyAnnotation{

}