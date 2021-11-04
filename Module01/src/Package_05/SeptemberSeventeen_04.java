package Package_05;

import java.util.Scanner;

public class SeptemberSeventeen_04 {
    public static void main(String[] args) {
        String userName ="abc";
        String passWord= "bilibili";

        for(int i=0;i<3;i++) {


            Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名");
            String name = sc.nextLine();

            System.out.println("请输入密码");
            String pas = sc.nextLine();

            if (name.equals(userName) && pas.equals(passWord)) {
                System.out.println("登录成功");
                break;
            } else {
                if((2-i)==0) {
                System.out.println("你的账户已锁定");
            }else{
                    System.out.println("登录失败,你还有" + (2 - i) + "次机会");
                }
            }
        }
    }
}
