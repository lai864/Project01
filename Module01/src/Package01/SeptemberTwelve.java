package Package01;

//import java.util.Scanner;

public class SeptemberTwelve {
    public static void main(String[] args) {
        /*switch语句(输入的值符合值1执行语句体1，执行break中断，switch语句完成。不符合值1跳过，比较值2，符合，执行语句体2。....
        都不符合执行default的语句体。
        格式：
        switch(关系表达式) {
        case值1:
            语句体1；
            break；
         case值2:
            语句体2；
            break;
            .......
         default:
            语句体n+1;
            break
            }
        */
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数（1-7）");
        int week =sc.nextInt();
        switch(week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入星期数有误");
                break;

        }
         */

        //case穿透
        //输入月数，输出季节
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份数");
        int month = sc.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("输入月份数有误");
                break;

        }

         */
        /*
        for循环语句
        for(初始化语句；条件判断语句；条件控制语句）{
        循环体语句；
        }
        执行流程
        1.执行初始化语句
        2.执行条件判断语句，看其结果是ture还是false
            如果是false结束循环
            如果是true继续执行
         3.执行循环体语句
         4.执行条件控制语句
         5.回到2继续

         */
        //for(int i=1;i<=5;i++){
        //System.out.println("HelloWorld");
        // System.out.println(i);
        for (int a = 5; a >= 1; a--) {
            System.out.println(a);
        }
        System.out.println("..........");
        //for求和
        int sum = 0;
        for (int b = 1; b <= 5; b++) {
            sum += b;
        }
        System.out.println(sum);
        System.out.println(".......");
        //for求1-100偶数和
        int sum2 = 0;
        for (int c = 1; c <= 100; c++) {
            if (c % 2 == 0) {
                sum2 += c;
            }
        }
        System.out.println("1-100的总和是：" + sum2);
        System.out.println("...........");

    /*while语句
        基本格式：
            while(条件判断语句）{
            循环体语句；
            }
         完整格式：
            初始化语句；
            while(条件判断语句）{
            循环体语句；
            控制条件语句；
            }
         执行流程：
            1.执行初始化语句
            2.执行条件判断语句看是ture,还是false
            3.ture继续执行，false循环结束
            4.执行循环体语句
            5.执行条件控制语句
            6.回到2继续
     */
        int d = 1;
        while (d <= 5) {
            System.out.println(d);
            d++;
            System.out.println("......");
            for (int e = 1; e <= 5; e++) {
                System.out.println(e);
            }
        }

        //纸张折叠多少次为珠峰高度
        int count = 0;
        double zhi = 0.1;
        double zf=8844430;
        while(zhi<=zf){
            zhi*=2;
            count++;

        }
        System.out.println(count);

        /*do...while先执行再判断
        完整格式：
            初始化语句；
            do{
            循环体语句；
            条件控制语句；
            }while(条件判断语句）；
         */
        int f=1;
        do{
            System.out.println("HelloWorld");
            f++;
        }while(f<=5);
        System.out.println("......");



        //for循环，while，do while循环的区别
        for(int g=1;g<=5;g++){
            System.out.println("HelloWorld");
        }
        System.out.println("......");
        /*for(;;){
            System.out.println("for死循环");
        }
         */



        int h=1;
        while(h<=4){
            System.out.println("up!up!");
            h++;
        }
        /*while(true){
            System.out.println("while死循环");
        }
         */
        System.out.println(".....");



        int j=1;
        do{
            System.out.println("love");
            j++;
        }while(j<=3);
        /*do{
            System.out.println("do...while死循环");
        }while(true);
         */



        //continue(跳过），break(终止）
        for(int k=1;k<=5;k++){
            if(k%2==0){
               // continue;
                break;
            }
            System.out.println(k);
            //循环语句for一个循环中条件控制语句最后执行
            }

        //循环嵌套(第一个for是外循环，后面是内循环。每外循环执行一次，内循环执行全部变量值。
        for(int hour=0;hour<=4;hour++){
            for(int min=0;min<4;min++){
                System.out.println(hour+"时"+min+"分");
            }
        }
            int m,n;
        for( m=1;m<=9;m++){//第一次外循环m=1,内循环取值1-9
            for( n=1;n<=m;n++){
                System.out.print(m+"*"+n+"="+m*n+" ");//
            }
            System.out.println();//外循环执行一次，内循环执行n(max)次，此处语句执行一次，程序结束执行m次
        }
        //外循环执行m(max)次，此处语句执行一次，程序结束执行一次
//    }
    }
}
