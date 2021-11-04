package Package_03;
/*哈希值
* 哈希值：是JDK根据对象的地址或者字符串或者数字算出来的int类型的数值
*
* Object类中有一个元素可以获取对象的哈希值
* public int hashCode():返回对象的哈希码值
*
* 对象的哈希值特点
*   同一个对象多次调用hashCode()方法返回的哈希值是相等的
* 默认情况下：不同对象调用hashCode()方法返回的哈希值是不相等的
  通过方法重写hashCode()方法，可以实现不同对象的哈希值是相同的
* */
public class SetHashSet {
    public static void main(String[] args) {
        Student s1 = new Student("巨魔叔叔",23);
        //同一个对象多次调用hashCode()方法返回的哈希值是相等的
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(".........");

        //默认情况下：不同对象调用hashCode()方法返回的哈希值是不相等的
        //通过方法重写，可以实现不同对象的哈希值是相同的
        Student s2 = new Student("混世魔王",23);
        System.out.println(s2.hashCode());

        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());

        System.out.println("巨魔叔叔".hashCode());
        System.out.println("混世魔王".hashCode());

        //相同
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
