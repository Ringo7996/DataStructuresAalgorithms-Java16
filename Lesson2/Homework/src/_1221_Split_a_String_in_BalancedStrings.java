public class _1221_Split_a_String_in_BalancedStrings {
    public static int balancedStringSplit(String s) {
        int countBalancedString = 0;
        int k = 0;
        int countR = 0;
        for (int i = k; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals("R")) {
                countR++;
            }
            if (countR == (i - k + 1) / 2 && (i - k + 1) % 2 == 0) {
                countBalancedString++;
                k = i + 1;
                countR = 0;
            }
        }
        return countBalancedString;
    }
}
