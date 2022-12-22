public class _1464_Maximum_Product_of_Two_Elements_in_an_Array {
    public int maxProduct(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int indexOfMax = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[indexOfMax]) {
                    indexOfMax = j;
                }
            }

            int temp = nums[indexOfMax];
            nums[indexOfMax] = nums[i];
            nums[i] = temp;

            if (i == 1) {
                break;
            }
        }

        return (nums[0] - 1) * (nums[1] - 1);
    }
}
