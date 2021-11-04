package Package_07;

import java.util.ArrayList;

/*需求：创建一个存储字符串的集合，存储三个字符串元素，使用程序实现在控制台遍历该集合*/
public class SeptemberNineteen_01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");

        /*System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
         */

        //遍历集合通用格式
        for(int i=0;i<array.size();i++){
            String s = array.get(i);
            System.out.println(s);
        }

    }
}
