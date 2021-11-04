package Package_05;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*键盘录入字符串 ，控制台输出每个字符串的个数*/
public class MapDemo_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //输入一个字符串
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

//        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        TreeMap<Character,Integer> hm = new TreeMap<Character,Integer>();

        for (int i=0;i<line.length();i++){
            char key = line.charAt(i);

            Integer value = hm.get(key);

            if(value==null){
                hm.put(key,1);
            }else {
                value++;
                hm.put(key,value);
            }
        }

        StringBuilder sb =new StringBuilder();

        Set<Character> characters = hm.keySet();
        for (Character keys:characters){
            Integer values = hm.get(keys);
            sb.append(keys).append("(").append(values).append(")");
        }

        String result = sb.toString();
        System.out.println(result);
    }
}
