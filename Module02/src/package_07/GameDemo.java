package package_07;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 4; i++) {
            int ran = Game.ranDom();
            //数人一个猜的数
            System.out.println("请猜一个数0-999范围");
            int num = sc.nextInt();
            myStore(i);
            myLoad(i);
            if(i==3){
                System.out.println("游戏试玩已结束，想玩请充值(www.chen.com)");
            }


        }
    }

    private static void myLoad(int i) throws IOException{
        Properties prop = new Properties();
        FileReader fr =  new FileReader("Module02\\猜数字游戏.txt");
        prop.load(fr);
        String s = String.valueOf(i);
        System.out.println(prop.getProperty(s));
        fr.close();


    }

    private static void myStore(int i) throws IOException {
        Properties prop = new Properties();
        int j = 3-i;
        String s = String.valueOf(i);
        String s2 = String.valueOf(j);

        prop.setProperty("count","0");
        prop.setProperty(s,s2);//s=1,s2=2

        FileWriter fw = new FileWriter("Module02\\猜数字游戏.txt");
        prop.store(fw,"写入文件");

        fw.close();

    }

}
