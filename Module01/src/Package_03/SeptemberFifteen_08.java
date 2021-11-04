package Package_03;

import java.util.Scanner;

/*Debug:
*   是供程序员使用的程序调试工具，它可以用于查看程序的执行流程，也可以用于追踪程序执行过程来调试程序。
*   Debug调试，有被称为断点调试，断点其实是一个标记，告诉我们从哪里开始查看。*/
public class SeptemberFifteen_08 {
    public static void main(String[] args) {
        /*int i = 10;
        int j = 20;

        int sum = i + j;//sum=30
        System.out.println(sum);

         */
        //循环求偶数和
       /* int sum=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);

        */
    Scanner sc =new Scanner(System.in);
        System.out.println("请输入a");
    int a = sc.nextInt();
        System.out.println("请输入b");

        int b = sc.nextInt();
        int max =getMax(a,b);
        System.out.println("最大值为"+max);

    }
    public static int getMax(int a,int b){
        if(a>b){
            return a;
        }else{
            return  b;
        }
    }
}
//Debug有时要键盘录入