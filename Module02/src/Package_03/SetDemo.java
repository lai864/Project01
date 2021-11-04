package Package_03;

import java.util.HashSet;
import java.util.Set;

/*Set集合概述和特点
* Set集合特点
*   不包含重复元素的集合
*   没有带索引的方法，所以不能使用普通for循环遍历
*
* HashSet:对集合的迭代顺序不作任何保证
*
* Set集合练习
* 储存字符串遍历*/
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("巨魔叔叔");
        set.add("hello");
        set.add("java");
        set.add("巨魔叔叔");
        System.out.println(set);

        for (String s:set){
            System.out.println(s);
        }
    }
}
