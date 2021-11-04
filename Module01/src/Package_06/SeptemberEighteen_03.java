package Package_06;
/*定义方法将数组拼接成字符串*/
public class SeptemberEighteen_03 {
    public static void main(String[] args) {
        int[] arr = { 11,22,33,44};

        String result = number(arr);
        System.out.println(result);
    }
    public static String number(int[] arr){
        String s ="";
        s+="[";

        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                s+=arr[i];
            }else{
                s+=arr[i];
                s+=", ";
            }
        }
        s+="]";
        return s;
    }
}
