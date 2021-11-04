package Package_04;

import java.util.Scanner;

public class SeptemberSixteen_05 {
    public static void main(String[] args) {
    int[] arr=new int[6];
        Scanner sc =new Scanner(System.in);
        for(int a=0;a<arr.length;a++){
            System.out.println("请输入"+(a+1)+"个评委的分数");
            arr[a] =sc.nextInt();
        }
        int max=getMax(arr);
        int min=getMin(arr);
        int sum=getSum(arr);
        double average=(double)(sum-max-min)/(double)(arr.length-2);

        System.out.println("平均分是："+average);
    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for(int x=1;x<arr.length;x++){
            if(arr[x] > max){
                max=arr[x];
            }
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int getSum(int[] arr){
        int sum =0;
        for(int c=0;c<arr.length;c++){
            sum+=arr[c];
        }
        return sum;
    }


}
