import java.util.Arrays;

public class _1913_Maximum_Product_Difference_Between_Two_Pairs {
    public int maxProductDifference(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int indexOfMin = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[indexOfMin]){
                    indexOfMin = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[indexOfMin];
            nums[indexOfMin] = temp;
        }

        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }
}
