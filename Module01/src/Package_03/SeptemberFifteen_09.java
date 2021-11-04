package Package_03;

import java.util.Scanner;

public class SeptemberFifteen_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个日期数");
        int week = sc.nextInt();

        /*switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢跑");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("输入星期数错误");
        }

         */
        if(week<1 || week>7){// &&有false就跳过 ||有true就执行
            System.out.println("输入星期数错误");
        }else if(week==1){
            System.out.println("星期一");
        }else if(week==2){
            System.out.println("星期二");
        }else if(week==3){
            System.out.println("星期三");
        }else if(week==4){
            System.out.println("星期四");
        }else if(week==5){
            System.out.println("星期五");
        }else if(week==6){
            System.out.println("星期六");
        }else {
            System.out.println("星期日");
        }
    }


}
