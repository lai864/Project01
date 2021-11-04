package Package_02;
/*带参数方法的定义和调用(两种形式）
*      带参数方法的定义
*   格式：public static void 方法名（参数）{....方法语句....}
*
*   格式：public static void 方法名（数据类型 变量名）{.....方法语句..}
*   范例：public static void isEvenNumber(int number){....}
*
*   格式：public static void 方法名（数据类型 变量名1，数据类型2 变量名2，.....){...方法语句....}
*   范例：public static void isEvenNumber(int number1,int number2,.....){.........}
*
*
*        带参数方法的调用
*   格式：方法名（参数）；
*
*   格式（单个参数）：方法名（变量名/常量值）；
*   范例（单个参数）：isEvenNumber(5);
*
*   格式（多个参数）：方法名（变量名1/变量值2，变量名2/变量值2）
*   范例（多个参数）：getMax(5,6)*/

public class SeptemberFourteen_03 {
    public static void main(String[] args) {
        /*带参数方法的定义和调用
        *   定义格式：
        * public static void 方法名（参数）{.....}
        *   调用格式：
        * 方法名（参数）*/
        //isEvenNumber(10);//常量值的调用
        //变量名的调用
        int number = 11;
        isEvenNumber(number);
    }
    public static void isEvenNumber(int number){
        if(number%2==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    /*形参和实参
            形参：方法定义中的参数
                等同于变量定义格式，例如：int number
            实参：方法调用中的参数
                等同于使用变量或常量，例如：10，number
     */

}


