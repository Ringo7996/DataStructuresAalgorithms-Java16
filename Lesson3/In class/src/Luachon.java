import java.util.Arrays;

public class Luachon {
//    public static void main(String[] args) {
//        int[] arr = {5, 3, 1, 6, 7, 2, 9, 0, 2, 4};
//        System.out.println(Arrays.toString(sort(arr)));
//    }

    public static int[] sort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i > 0; i--) {
            int indexofmax = i;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[indexofmax]) {
                    indexofmax = j;
                }
            }

            //  swap(max, arr[arr.length - 1 - i]);
            int temp = arr[indexofmax];
            arr[indexofmax] = arr[i];
            arr[i] = temp;
            System.out.println("--");

        }
        return arr;
    }
}
