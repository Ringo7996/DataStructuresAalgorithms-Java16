import java.util.Arrays;

public class Chen {

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 6, 7, 2, 9, 0, 2, 4};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];

            int j = i;
            while ((j > 0) && (arr[j - 1] > value)) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = value;
        }
        return arr;
    }
}
