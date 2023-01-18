import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] nums = {5, 1, 1, 2, 0, 0};
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    public static int[] sortArray(int[] nums) {
        return quickSort(nums, 0, nums.length - 1);
    }

    public static int[] quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return nums;
        }
        int key = nums[(start + end) / 2];
        int i = start;
        int j = end;

        while (i < j) {
            while (nums[i] < key) {
                i++;
            }
            while (nums[j] > key) {
                j--;
            }

            if (i <= j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(nums, start, j);
        quickSort(nums, i, end);

        return nums;
    }
}
