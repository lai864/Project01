package Package_10;

import java.util.Scanner;

public class ZiFuChuang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        for(int x=line.length()-1;x>=0;x--){
            //System.out.println(line);
            System.out.print(line.charAt(x));
        }
    }
}
