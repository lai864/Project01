package Package_09.Interface;
/*接口组成更新
*   更新概述
* 接口的组成
*   常量：
*   public static final
*   抽象方法：
*   public abstract
* 更新
*   默认方法(Java 8)
*   静态方法(Java 8)
*   私有方法(Java 9)*/


/*接口中默认方法
* 接口中默认方法的定义格式
*   格式：public default 返回值类型，方法名（参数列表）{}
*   范例：public default void show3(){}
*
* 接口中默认方法的注意事项：
*   默认方法不是抽象方法，所以不强制重写，但是可以重写，重写的时候去掉default关键字
*   public可以省略，default不能省略
* */

/*接口中静态方法
*   接口口中静态方法的定义格式：
*   格式：public static 返回值类型 方法名(参数列表){}
*   范例：public static void show4(){}
*
* 接口中静态方法的注意事项：
*   静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
*   public 可以省略，static不能省略*/

/*接口中私有方法
*   当两个默认方法或者静态方法中包含一段相同的代码时，使用私有方法
*
* 接口中私有方法的定义格式
*   格式1：private 返回值类型 方法名(参数列表){}
*   范例：private void method(){}
*   格式2：private static 返回值类型 方法名(参数列表){}
*   范例2：private static void method(){}
*
* 接口中私有方法的注意事项：
*   默认方法可以调用私有方法和私有静态方法
*   静态方法只能调用接口中的私有静态方法*/
public class October_01 {
}
