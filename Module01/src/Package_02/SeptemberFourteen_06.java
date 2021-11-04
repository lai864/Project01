package Package_02;
/*带返回值方法练习
* 需求：设计一个方法可以获取两个数的较大值，数据来源于参数*/
public class SeptemberFourteen_06 {
    public static void main(String[] args) {
    //int result = getMax(10,20);
        //System.out.println(result);
        System.out.println(getMax(10,20));
    }
    public static int getMax(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
/*方法注意事项
*   1.方法不能嵌套定义
*   2.void表示无返回值，可以省略return,也可以单独的书写return,有结束的作用，后面不加数据*/


/*方法的通用格式（
*   格式：public static 返回值类型 方法名(参数){
*           方法体；
*           return 数据；
*
*   public static      修饰符，目前先记住这个格式
*   返回值类型           方法操作完毕之后返回的数据的数据类型
*                      如果方法操作完毕，没有数据返回，这里写void,而且方法体中一般不写return
*    方法名             调用方法时使用的标识
*    参数               由数据类型和变量名组成，多个参数之间用逗号隔开
*    方法体             完成功能的代码块
*    return            如果方法操作完毕，有数据返回，用于把数据返回给调用者
*
*  定义方法时，要做到两个明确
*       明确返回值类型：主要是明确方法操作完毕之后是否有数据返回，如果没有，写void；如果有，写对应数据类型
*       明确参数：主要是明确参数的类型和数量
*
*  调用方法时
*       void类型的方法，直接调用即可（方法名/方法值调用）
*       非void类型的方法，推荐使用变量接收调用
* 基本都有返回值，*/
