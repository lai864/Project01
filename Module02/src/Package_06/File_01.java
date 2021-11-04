package Package_06;
/*递归
* 递归概述：指方法定义中调用方法本身的现象
* 递归出口：否则会出现内存溢出
* 递归规则：与远问题相似的规模较小的问题
*
* 范例：不死神兔*/
public class File_01 {
    public static void main(String[] args) {
        //第一，二月除外，第n个月的兔子总数是n-1和n-2个月兔子的和
        System.out.println(f(20));

        System.out.println(jc(5));
    }

    public static int f(int month){
        if (month==1 || month==2){
            return 1;
        }else {
            return f(month-1)+f(month-2);
        }
    }

    //求5！：5*4*3*2*1.在栈中调用方法遵循先进后出
    public static int jc(int number ){
        if (number==1){
            return 1;
        }else {
            return number*jc(number-1);
        }
    }
}
