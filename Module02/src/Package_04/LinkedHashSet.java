package Package_04;
/*LinkHashSet集合概述和特点
*   哈希表和链表实现的Set接口，具有可预测的迭代次序
*   由链表保证元素有序，也就是说元素的储存和取出顺序是一样的
*   由哈希表保证元素唯一，也就是说没有重复的元素
*
* LinkHashSet集合练习：储存字符串遍历*/
public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet<String> lhs = new java.util.LinkedHashSet<String>();
        lhs.add("巨魔叔叔");
        lhs.add("混世魔王");
        lhs.add("王祖贤");
        lhs.add("混世魔王");

        for (String s:lhs){
            System.out.println(s);
        }
    }
}
