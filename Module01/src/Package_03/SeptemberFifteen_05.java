package Package_03;
/*方法参数传递（引用类型）
* 引用类型调用方法实参改变*/
public class SeptemberFifteen_05 {
    public static void main(String[] args) {
    int[] arr ={10,20,30};
        System.out.println("调用isEvenNumber方法前："+arr[1]);
        isEvenNumber(arr);
        System.out.println("调用isEvenNumber方法后"+arr[1]);
    }
    public static void isEvenNumber(int[] arr){
        arr[1]=200;
    }
}
