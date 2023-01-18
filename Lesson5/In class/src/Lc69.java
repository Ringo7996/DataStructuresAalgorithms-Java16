public class Lc69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        if (x >= 2147395600) {
            return 46340;
        }
        int start = 0;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long power = (long) mid * mid;

            System.out.println("start " + start + " end " + end);
            System.out.println("mid  " + mid);
            System.out.println("power " + power);

            if (power == x) {
                return mid;
            } else if (power > x) {
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
}
