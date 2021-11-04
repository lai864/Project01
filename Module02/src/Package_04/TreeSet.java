package Package_04;
/*TreeSet集合概述和特点(必须重写方法比较，或者本身能被比较)
*   元素有序。这里的顺序不是指储存和取出的顺序。而是按照一定规则进行排序，具体排序方法取决于构造方法
* TreeSet():根据其元素的自然排序(从小到大)进行排序
* TreeSet(Comparator comparator):根据指定的比较器进行排序
*
* 没有带索引的方法，所以不能使用普通for循环遍历
* 由于是Set集合，所以不包含重复元素的集合
*
* TreeSet集合练习
*   储存整数并遍历
* */
public class TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<Integer> ts = new java.util.TreeSet<Integer>();//集合只能使用引用类型，定义了封装类，就能自动装箱

        ts.add(23);
        ts.add(12);
        ts.add(34);
        ts.add(53);
        ts.add(23);

        System.out.println(ts);
        for (Integer i:ts){
            System.out.println(i);
        }
    }
}
