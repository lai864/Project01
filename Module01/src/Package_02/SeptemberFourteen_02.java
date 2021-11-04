package Package_02;
/*什么是方法
           方法是将具有独立功能的代码块组织成一个整体，使其具有特殊功能的代码集

        */
public class SeptemberFourteen_02 {
    public static void main(String[] args) {

        //调用方法
        isEvenNumber();
        getMax();
    }

    public static void isEvenNumber() {
        /*方法定义
        格式：public static void 方法名（）{
            方法体；
         */

        int number = 10;
        if (number % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
    public static void getMax(){
        int a=3;
        int b =7;
        if(a>b){
            System.out.println("max:"+a);
        }else{
            System.out.println("max:"+b);
        }
    }




}

