package Package_02;

import java.util.Scanner;

public class ScoreExceptionDemos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数");
        int score = sc.nextInt();

        ScoreExceptionDemo s = new ScoreExceptionDemo();
        try {
            s.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
