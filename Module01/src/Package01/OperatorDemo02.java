package Package01;
/*
自增++ 自减--
 */

import java.util.Scanner;

public class OperatorDemo02 {
    public static void main(String[] args) {
        int i = 10;
        //i++;单独使用没区别
        //++i;
        System.out.println("i:" + i);
        //int j = i++;++放后面先操作，再++即j=i=10,i=i+1=11
        int j = ++i;//++放前面先++，再操作即i=i+1=11,j=i=11
        System.out.println("i:" + i);
        System.out.println("j:" + j);
        /*
        关系运算符（== != < > <= >=)
         */
        //定义变量
        int a = 10;
        int b = 20;
        int c = 10;
        //==是否相等
        System.out.println(a == b);
        System.out.println(a == c);
        //!=是否不相等
        System.out.println(a != b);
        System.out.println(a != c);
        System.out.println("-------");


        /*
        逻辑运算符(与&，或|，异或^,非！）
         */
        //定义变量
        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println((x > y) & (x > z));//有false则false，如果用二进制表示与，是交集，true是1，false是0，交集为0,0是false
        System.out.println((x < y) | (x < z));//有true则true
        System.out.println((x < y) ^ (x > z));//不相同为true,相同为false
        System.out.println(!(x < z));//取反
        /*
        短路逻辑运算符（&&,||,^^)不计算特性与&和|一样
         */
        //不同特性短路
        System.out.println((x++ > 100) && (y++ > 100));
        System.out.println("x:" + x);//为false,y++不计算，即左假，右不执行
        System.out.println("y:" + y);

        /*
        三元运算符
        关系表达式？表达式1：表达式2
        例a>b?a:b
        关系表达式true输出表达式1结果
        关系表达式false输出表达式2结果
         */
        int e = 5;
        int f = 10;
        int max = e > f ? e : f;
        System.out.println("max:" + max);
        System.out.println("------------------");
        int weight = 100;
        int weight2 = 120;
        boolean g = weight < weight2 ? true : false;
        System.out.println("g:" + g);
        //三个比较
        int height = 165;
        int height2 = 175;
        int height3 = 185;
        int heighter = height > height2 ? height : height2;
        int maxheight = heighter > height3 ? heighter : height3;
        System.out.println("maxheight:" + maxheight);
        System.out.println("------");

        /*
        数据输入
        导包
            import.java.util.Scanner
         创建对象
            Scanner sc = new Scanner(System.in)
          接收数据
            int x = sc.nextInt()
         */
        //Scanner sc = new Scanner(System.in);
        //int h = sc.nextInt();
        //System.out.println("h:"+h);
        //比较三个未知数，输出最大或最小
       /* Scanner sc = new Scanner(System.in);
        //输入数据
        System.out.println("请输入第一个人的身高");
        int height4 = sc.nextInt();
        System.out.println("请输入第二个人的身高");
        int height5 = sc.nextInt();
        System.out.println("请输入第三个人的身高");
        int height6 = sc.nextInt();
        //三元运算法，比较前两个数据大小，保存中间量
        int tempheight = height4>height5?height4:height5;
        //与第三个数比较
        int maxheight2 = tempheight>height6?tempheight:height6;
        //输出最大值
        System.out.println("最大身高是"+maxheight2);*/


        /*
        if表达格式一：
            if(关系表达式） {
            语句体
            关系表达式成立即true,执行语句体
            关系表达式不成立，不执行语句体
            执行后面语句
            }
         */
        int k = 10;
        int m = 20;
        if (k > m) {
            System.out.println("GG");
        }
        if (k < m) {
            System.out.println("GG");
        }
        /*if语句表达式二(关系表达式true执行语句体1，false执行语句体2）
            表达式
            if(关系表达式）{
            语句体1
         }        else {
                语句体2
          }
                */
        int l = 10;
        int l2 = 20;
        if (l > l2) {
            System.out.println("l比l2大");
        } else {
            System.out.println("l比l2小");
        }

        /*判断是否奇偶数
        采用输入数据，if语句
         */
        //创建对象
       /* Scanner sc = new Scanner(System.in);
        //输入数据
        System.out.println("请输入一个数");
        int number = sc.nextInt();
        if(number % 2 == 1) {
            System.out.println(number+"奇数");
        } else {
        System.out.println(number+"偶数");
        }
        */

        /*
        If表达式三（大与两种情况的比较）
        表达式
            if(表达式1) {
            语句体1
            }else if{
            语句体2
            .....
            }
        */
       /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数");
        int week = sc.nextInt();
        if(week == 1) {
            System.out.println("星期一");
        } else if (week==2){
            System.out.println("星期二");
        } else if (week==3){
            System.out.println("星期三");
        } else if (week==4){
            System.out.println("星期四");
        } else if (week==5){
            System.out.println("星期五");
        } else if (week==6){
            System.out.println("星期六");
        } else if (week==7){
            System.out.println("星期日");
        }
    */
        System.out.println("请输入成绩");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if ((score < 0) || (score > 100)) {
            System.out.println("您输入的数据有误");
        } else if ((100 >= score) && (score >= 95)) {
            System.out.println("奖励手办一个");
        } else if ((score >= 90) && (score <= 94)) {

        } else if ((score >= 85) && (score <= 89)) {
            System.out.println("山地自行车一辆");
        } else if ((score >= 80) && (score <= 84)) {
            System.out.println("变形金刚一个");
        }else if(score<80){
            System.out.println("胖揍一顿");
        }


    }
}
