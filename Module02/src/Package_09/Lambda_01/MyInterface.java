package Package_09.Lambda_01;
/*函数式接口概述
* 函数式接口有且仅有一个抽象方法的接口
* Java中的Lambda才能顺利的进行推导
*
* 如何检测一个接口是不是接口呢？
*   @FunctionalInterface
*   放在接口定义的上方，如果接口是函数式接口，编译通过，如果不是，编译失败
*
* 注意
*   我们自己定义函数式接口的时候，@FunctionalInterface是可选的，就算不写这个注解，只要满足函数式接口定义的条件，也照样是函数式接口，但是建议加上该注解*/



/*函数式接口作为方法的参数*/

@FunctionalInterface
public interface MyInterface {
    void show();
}
