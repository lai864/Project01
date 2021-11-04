package Package01;

public class SeptemberTwelve2 {


    public static void main(String[] args) {

        //水仙花：三位数的个十百的立方等于原数
        for(int i=100;i<=999;i++){
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/10/10%10;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                System.out.println(i);
            }
        }

        //计数
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int a = i%10;
            int b = i/10%10;
            int c = i/10/10%10;
            if (a * a * a + b * b * b + c * c * c == i) {
               count++;
                // System.out.println(i);
            }

        }
        System.out.println(count);



    }
}
