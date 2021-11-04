package Package_04;
//键盘键入数据是否是数组元素
import java.util.Scanner;

public class SeptemberSixteen_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数据");
        int number = sc.nextInt();
        int[] arr = {19,28,37,46,50};
        int index = -1;
        for(int x=0;x<arr.length;x++){
            if(arr[x]==number){
               index = x;
               break;
            }
        }
        System.out.println(index);
    }
}
