package Package_03;

public class SeptemberFifteen_07 {
    public static void main(String[] args) {
        int[] arr = {18,29,37,19,100};
        int number = getMax(arr);//数组arr
        System.out.println(number);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
