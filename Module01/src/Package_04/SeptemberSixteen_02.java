package Package_04;
//数组是否相等，一一对应
public class SeptemberSixteen_02 {
    public static void main(String[] args) {
        int[] arr ={2,3,4};
        int[] arr2={3,2,4};
        boolean result =compare(arr,arr2);
        System.out.println(result);
    }
    public static boolean compare(int[] arr,int[] arr2) {
        if (arr.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    }
