import java.util.Arrays;

public class _2160_Minimum_Sum_of_Four_Digit_Number_After_Splitting_Digits {
    public int minimumSum(int num) {
        int[] numArray = new int[4];
        int i = 0;
        while (num != 0) {
            numArray[i] = num % 10;
            num /= 10;
            i++;
        }

        Arrays.sort(numArray);
        return numArray[0] * 10 + numArray[2] + numArray[1] * 10 + numArray[3];

    }
}
