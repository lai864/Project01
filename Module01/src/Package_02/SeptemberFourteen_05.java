package Package_02;
/*带返回值方法的定义和调用

*带返回值方法定义
*   格式：public static 数据类型 方法名（参数）{
        turn 数据；
        }

        范例1：public static boolean isEvenNumber(int number){
            return true;

         范例2：public static int getMax(int a,int b){
            return 100;
            }
            注意：方法定义时return后面的返回值与方法定义上的数据类型要匹配，否则程序将报错

 带返回值方法调用：（格式一多数情况无意义）
           格式1：方法名（参数）
           范例：isEvenNumber(参数);

           格式2：int flag = isEvenNumber(5);变量flag接收
           注意：方法的返回值通常会使用变量接受，否则将无意义
* */
public class SeptemberFourteen_05 {
    public static void main(String[] args) {
       // isEvenNumber(5);
        boolean flag = isEvenNumber(5);//定义变量flag接收return值
        System.out.println(flag);
       // System.out.println(isEvenNumber(5));
    }
    //需求定义一个方法，该方法接收一个参数，判断数据是否是偶数，并返回真假值
    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }
}
