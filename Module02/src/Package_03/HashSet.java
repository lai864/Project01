package Package_03;
/*HashSet集合概述和特点
*   底层数据结构是列表
*   对集合的迭代顺序不做任何保证，也就是说不保证储存和取出的元素顺序一致
*   没有带索引的方法，所以不能使用普通for循环遍历
*   由于是Set集合，所以是不包含重复元素的集合*/

//HashSet练习
public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<String> hs = new java.util.HashSet<String>();
        hs.add("巨魔叔叔");
        hs.add("混世魔王");
        hs.add("王祖贤");
        hs.add("巨魔叔叔");//HashSet不重复
        hs.add("巨魔叔叔");//不重复
        hs.add("巨魔叔叔");//不重复

        System.out.println(hs);
        for (String s:hs){
            System.out.println(s);
        }
    }
}
