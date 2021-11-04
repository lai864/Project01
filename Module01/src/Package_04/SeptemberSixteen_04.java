package Package_04;

public class SeptemberSixteen_04 {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};
        System.out.print("[");
        for(int x=arr.length-1;x>=0;x--){
            if(x==0){
                System.out.print(arr[x]);
            }else{
                System.out.print(arr[x]+",");
            }
        }
        System.out.print("]");
    }

}
