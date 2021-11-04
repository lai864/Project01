package LeetBook;

public class Demo_02 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9,11};
        int height = nums.length-1;
        int result = searchInsert(nums,9,0,height);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums,int target,int low,int height){

            while (low<=height) {
               int search = (low + height) / 2;

                if (target == nums[search]) {
                   return search;
                } else if (nums[search] > target) {
                    height = search - 1;
                    if (height<low){
                        return low;
                    }
                } else if (nums[search] < target) {
                    low = search + 1;
                    if (low>height){
                        return low;
                    }

                }
            }

            return -1;
    }
}
