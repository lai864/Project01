package Package_04;
/*泛型接口
泛型接口定义格式：
    格式：修饰符interface接口名<类型>{}
    范例：public interface Generic<T>{}
*/

public interface ImpGeneric<T> {
    void eat(T t);
}
