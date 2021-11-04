package Package_03;
//有一对兔子，三个月一胎，20个月后有几对兔子
public class SeptemberFifteen_11 {
    public static void main(String[] args) {
        int[] arr = new int[20];//定义数组长度20

        arr[0] =1;//数组第一个元素值是1
        arr[1]=1;//数组第二个元素是1

        for(int x=2;x<arr.length;x++){
            arr[x]=arr[x-2]+arr[x-1];
            /*
            arr[2]=arr[0]+arr[1];
            arr[3]=arr[1]+arr[2];
            arr[4]=arr[2]+arr[3];
             */
        }
        System.out.println("第二十个月兔子的对数是："+arr[19]);//元素从arr[0]开始

    }
}
