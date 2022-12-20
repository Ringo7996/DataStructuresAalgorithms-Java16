public class _557_Reverse_Words_in_a_String_III {
    public String reverseWords(String s) {
        String[] spit = s.split(" ");

        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < spit.length; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = spit[i].length() - 1; j >= 0; j--) {
                word.append(spit[i].charAt(j));
            }
            reverse.append(word).append(" ");
        }

        reverse.deleteCharAt(reverse.length() - 1);

        return String.valueOf(reverse);
    }
}
