package Package_01;
/*冒泡排序
* 如果有n个数据进行排序，总共需要比较n-1次
* 每一次比较一次，下一次的比较久会少一个数据参与*/
public class ArraysDemo {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {24,69,80,57,13};
        System.out.println("排序前:"+arrayToString(arr));


        for(int x=0;x<arr.length-1;x++){
            for(int i=0;i<arr.length-1-x;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println("四次排序后："+arrayToString(arr));

        /*
        //第一次比较;
        for(int i=0;i<arr.length-1-0;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println("第一次比较后"+arrayToString(arr));

        //第二次比较
        for(int i=0;i<arr.length-1-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println(arrayToString(arr));

        //第三次比较
        for(int i=0;i<arr.length-1-2;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println(arrayToString(arr));

        //第四次比较
        for(int i=0;i<arr.length-1-3;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println(arrayToString(arr));

         */

    }


    //把数组中的元素按照指定的规则 组成一个字符串，{元素1,元素2.....}
    public static String arrayToString(int arr[]){
        StringBuilder  sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }
        }
       sb.append("]");
        String s = sb.toString();
        return s;
    }
}
