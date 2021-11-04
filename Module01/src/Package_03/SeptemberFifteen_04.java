package Package_03;
/*方法的参数传递
*   方法的传递（基本类型）*/
public class SeptemberFifteen_04 {
    public static void main(String[] args) {
    int number=100;
        System.out.println("调用方法change前："+number);
        change(number);
        System.out.println("调用方法change后:"+number);
    }
    public static void change(int number){
        number = 200;
    }
}
