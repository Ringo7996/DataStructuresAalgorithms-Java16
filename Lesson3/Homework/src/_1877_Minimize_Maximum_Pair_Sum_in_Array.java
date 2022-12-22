import java.util.Arrays;

public class _1877_Minimize_Maximum_Pair_Sum_in_Array {
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = nums[0] + nums[nums.length - 1];

        for (int i = 0; i < nums.length / 2; i++) {
            if ((nums[i] + nums[nums.length - 1 - i]) > max) {
                max = nums[i] + nums[nums.length - 1 - i];
            }
        }
        return max;
    }
}
