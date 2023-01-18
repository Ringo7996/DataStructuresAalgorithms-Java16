class Solution {
    public static void main(String[] args) {
        if (isHappy(38)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean isHappy(int n) {
        int sum = 0;
        int x = n;
        while (x > 0) {
            sum += Math.pow(x % 10, 2);
            x /= 10;
        }

        if (sum == 1) {
            return true;
        }
//        if (sum == 145) {
//            return false;
//        }

        System.out.println(sum);

        return isHappy(sum);
    }
}