package Package_01;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {


        int[] arr = {10, 200, 3, 40};
        System.out.println(arr);
        int[] arr2 = new int[4];
        System.out.println(Arrays.toString(arr));//数组字符串形式输出
        Arrays.sort(arr);//数组自然排序
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("............");

        //数组必须遍历输出，或字符串形式输出,没有add,set,remove方法

        String s = "abcd";
        String s2 ="cd";
        System.out.println(s);
        System.out.println(s.contains(s2));
        System.out.println("............");
        ;

        //字符串能直接输出，没有add,set,remove方法


        StringBuilder sb = new StringBuilder();
        sb.append("qw");
        sb.append("er");

        sb.reverse();
        System.out.println(sb);

        String s1 = sb.toString();
        System.out.println(s1);
        System.out.println("............");

        //StringBuilder能直接输出 没有选定位置添加，有末尾添加，没有set,remove方法

        ArrayList<String> array = new ArrayList<String>();
        array.add("we");
        array.add("ty");
        array.add("mk");

        array.add(0,"insert");
        array.set(1,"cv");
        array.remove(2);
        System.out.println(array);


        /*System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
         */

        //遍历集合通用格式//增强for更通用
        for(int i=0;i<array.size();i++){
            String s11 = array.get(i);
            System.out.println(s11);
        }

    }

        //集合ArrayList能直接输出，有add,set任意位置添加，修改，remove修改任意位置
    }

