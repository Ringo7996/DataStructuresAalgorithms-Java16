public class DeQuy {
    public static void main(String[] args) {

    }

    public static void reverseString(char[] s) {
        hoandoi(s, 0, s.length - 1);
    }

    public static void hoandoi(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }
        swap(s, start, end);
        hoandoi(s, start + 1, end - 1);
    }

    public static void swap(char[] s, int a, int b) {
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }


    public static void printF() {
        System.out.println("F");
        printF();
    }

    public static void f(int n) {
        if (n > 9) {
            return;
        }
        System.out.println("start: " + n);
        f(n + 1);
        System.out.println("end: " + n);

    }

    public static int GiaiThua(int n) {
        if (n == 0) {
            return 1;
        }
        int t = n * GiaiThua(n - 1);
        System.out.println(t);
        return t;
    }

    public static int Fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }

        int Fn = Fibonacci(n - 1) + Fibonacci(n - 2);
        return Fn;
    }

}


