import java.util.Arrays;

public class Leetcode387 {

//    public static void main(String[] args) {
//        String str = "aabbcd";
//        firstUniqChar(str);
//    }

    public static int firstUniqChar(String s) {
        int[] frequency = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char curentChar = s.charAt(i);
            int index = curentChar - 97;
            frequency[index]++;
        }

        for (int i = 0; i < s.length(); i++) {
            char curentChar = s.charAt(i);
            int index = curentChar - 97;
            if (frequency[index] == 1) {
                return index;
            }
        }
        return 1;
    }
}
