import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // int[] nums1 = {2, 1};
        int[] nums1 = {5,2,3,1};
        int[] nums2 = {3, 6, 7, 9};

        int[] ans = new int[nums1.length];
        System.out.println(Arrays.toString(mergeSort(nums1, 0, nums1.length - 1)));

//        System.out.println(Arrays.toString(merge(nums1, nums2)));

    }

    public static int[] mergeSort(int[] nums, int start, int end) {
        if (start >= end) {
            return nums;
        }
        int mid = (start + end) / 2;
        int[] arr_left = mergeSort(nums, start, mid);
        int[] arr_right = mergeSort(nums, mid + 1, end);
        int[] ans = new int[end + 1];
        int i = start;
        int j = mid + 1;
        int u = start;

        while (i <= mid && j <= end) {
            if (arr_left[i] > arr_right[j]) {
                ans[u] = arr_right[j];
                j++;
                u++;
            } else {
                ans[u] = arr_left[i];
                i++;
                u++;
            }
        }
        while (i <= mid) {
            ans[u] = arr_left[i];
            i++;
            u++;
        }

        while (j <= end) {
            ans[u] = arr_right[j];
            j++;
            u++;
        }

        // System.out.println(Arrays.toString(nums));
        return ans;
    }


    public static int[] merge(int[] arr1, int[] arr2) {
        int[] mergeArr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int u = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                mergeArr[u] = arr2[j];
                j++;
                u++;
            }
            if (arr2[j] >= arr1[i]) {
                mergeArr[u] = arr1[i];
                i++;
                u++;
            }
        }
        while (i < arr1.length) {
            mergeArr[u] = arr1[i];
            i++;
            u++;
        }

        while (j < arr2.length) {
            mergeArr[u] = arr2[j];
            j++;
            u++;
        }
        return mergeArr;
    }
}
