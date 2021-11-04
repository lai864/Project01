package Package_03;
/*方法参数传递
* 案例：数组遍历
*   需求：设计一个方法用于遍历，要求遍历的结果是在一行上的，例如：[11,22,33,44]
*   System.out.print(内容)少了ln不换行*/
public class SeptemberFifteen_06 {
    public static void main(String[] args) {
    int[] arr = {11,22,33,44,55};
    isEvenNumber(arr);

    }
    public static void isEvenNumber(int[] arr){
        System.out.print("[");
         for(int i=0;i<arr.length;i++){
             if(i==arr.length-1) {//第五个元素执行，i=4,arr.length=5-1=4
                 System.out.print(arr[i]);
             }else {
                 System.out.print(arr[i]+",");//前4个数组元素执行这个语句
             }
         }
        System.out.print("]");
    }
}
