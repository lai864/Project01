package Package_06;
/*拼接字符串*/
public class SeptemberEighteen_07 {
    public static void main(String[] args) {
        int[] arr = {11,22,33};
        String result = isEvenNumber(arr);
        System.out.println(result);
    }
    public static String isEvenNumber(int[] arr){
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for(int i=0;i<arr.length;i++){

            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");

            }

        }

        sb.append("]");

        String sb2 =  sb.toString();
        return sb2;
    }
}
