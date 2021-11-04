package Package_03;
/*方法重载概述
*   方法重载指同一个类中定义的多个方法之间的关系，满足下列条件的多个方法相互构成重载
*   1.多个方法在同一个类中
*   2.多个方法具有相同的方法名
*   3.多个方法的参数不相同。类型不同或者数量不同
*
* 方法重载特点
*   1.重载仅对应方法的定义；与方法的调用无关，调用方式参照标准格式
*   2.重载仅针对同一个类中方法的名称与参数进行识别，与返回值无关，换句话说不能通过返回值来判定两个方法是否相互构成重载*/

//与返回值无关
//在调用的时候，Java虚拟机会通过参数的不同来区分同名的方法
public class SeptemberFifteen_01 {
    public static void main(String[] args) {
        System.out.println(EvenNumber(1,2,3));
        double result = EvenNumber(1.0,3.0);
        System.out.println(result);
        int result2 =EvenNumber(1,2);
        System.out.println(result2);
    }
    //需求1：求两个int类型数据和的方法
    public static int EvenNumber(int a,int b){
        return a+b;
    }
    //需求2：求两个double类型数据和的方法
    public static double EvenNumber(double a,double b){
        return a+b;
    }
    //需求3：求三个int类型数据和的方法
    public static int EvenNumber(int a,int b,int c){
        return a+b+c;
    }



    public static int EvenNumber(double c,int a,int b){
        return a+b;
    }

    public static int EvenNumber(int a,double c,int b){
        return a+b;
    }
}
