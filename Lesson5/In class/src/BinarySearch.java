public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(mySqrt(105));
    }

    public static int mySqrt(int x) {
        int start = 0;
        int end = x;


        while (start <= end) {
            int mid = (start + end) / 2;
            int power = mid * mid;
            System.out.println(start + " " + end);
            System.out.println(mid);
            System.out.println(power);
            if (power == x) {
                return mid;
            } else if (power < x) {
                end = mid - 1;
                if (end * end == x) {
                    return end;
                }
            } else {
                start = mid + 1;
                if (start * start == x) {
                    return start;
                }
            }
        }
        return end;
    }


    public static int TKNP(int[] arr, int k, int start, int end) {
        if (start > end) {
            return -1;
        }

        int m = (start + end) / 2;
        if (arr[m] == k) {
            return m;
        } else if (arr[m] > k) {
            return TKNP(arr, k, start, m - 1);
        } else {
            return TKNP(arr, k, m + 1, end);
        }
    }

    public static int TKNP2(int[] arr, int k, int start, int end) {
        while (start <= end) {
            int m = (start + end) / 2;
            if (arr[m] == k) {
                return m;
            } else if (arr[m] > k) {
                end = m - 1;
            } else {
                start = m + 1;
            }
        }
        return -1;
    }



    public int BinarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return start;
        }

        int mid = (start + end) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target && target < nums[mid + 1]) {
            return mid + 1;
        } else if (nums[mid] > target) {
            return BinarySearch(nums, target, start, mid - 1);
        } else {
            return BinarySearch(nums, target, mid + 1, end);
        }
    }


}
