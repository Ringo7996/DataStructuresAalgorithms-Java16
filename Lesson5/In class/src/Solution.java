import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0) {
            return 0;
        }
        if (nums[nums.length - 1] == nums.length - 1) {
            return nums.length;
        }

        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid == nums[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}