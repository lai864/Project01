package Package_02;

import java.util.Arrays;

/*需求：
*       有一个字符串：“91 27 46 38 50”请写程序最终输出结果是：”27 38 46 50 91“*/
public class IntegerTest {
    public static void main(String[] args) {
        String s ="91 27 46 38 50";

        //把字符串中的数字数据存储到一个int类型的数组中
        String[] strArray = s.split(" ");
        //for(int i=0;i<strArray.length;i++){
          //  System.out.println(strArray[i]);
        //}

        //定义一个int数组，把String[]数组中的每一个元素存储到int数组中
        int[] arr = new int[strArray.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(strArray[i]);
        }
       // for(int i=0;i< arr.length;i++){
            //System.out.println(arr[i]);
       // }

        //对int[]数组排序
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(int i=0;i< arr.length;i++){
            if(arr[i]== arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }
        }
        String s1 = sb.toString();
        System.out.println(sb);
    }
}
