package LeetBook;
//中心下标(有三种情况，1.左边的和等于右边，2.中间下标对应值为0，前后也是0，的多个中心下标情况，3.中心下标在数组两端),用非void方法简直nt;return；用于跳出此方法 return加参数跳出此方法，并传递一个参数，相同结果被覆盖
public class Arr_01 {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};

        int result = center(nums);
        System.out.println(result);

        centers(nums, result);//也正确
        System.out.println("........................");

        centering(nums);//正确

    }

    public static int center(int[] nums) {
        int leftSum = 0;
        int sum = 0;
        int center = -1;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            if (sum - leftSum == leftSum - nums[i]) {
                center = i;
             //   return i;
            }
        }


     /*   if ((sum - nums[0]) == 0) {
            //System.out.println(0);
            center = 0;
        } else if ((sum - nums[nums.length - 1]) == 0) {
            //System.out.println(nums.length-1);
            center = nums.length - 1;
        }

      */

        return center;
    }

    public static void centers(int[] nums, int result) {
        while (nums[result] == 0 && nums[result - 1] == 0) {
            result--;
            System.out.println(result);
        }
    }








    public static void centering(int[] nums) {
        int leftSum = 0;
        int sum = 0;


        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            if (sum - leftSum == leftSum - nums[i]) {
                System.out.println(i);
            }
        }


      /*  if ((sum - nums[0]) == 0) {
            //System.out.println(0);
            System.out.println(0);
        } else if ((sum - nums[nums.length - 1]) == 0) {
            //System.out.println(nums.length-1);
            System.out.println(nums.length - 1);
        }

       */

    }
}

