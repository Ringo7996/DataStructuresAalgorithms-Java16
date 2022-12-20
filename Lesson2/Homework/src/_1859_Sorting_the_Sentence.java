public class _1859_Sorting_the_Sentence {
    public String sortSentence(String s) {
        String[] word = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < word.length; i++) {
            for (int j = i; j < word.length; j++) {
                if (word[i].charAt(word[i].length() - 1) > word[j].charAt(word[j].length() - 1)) {
                    String temp = word[i];
                    word[i] = word[j];
                    word[j] = temp;
                }
            }
            ans.append(word[i].substring(0, word[i].length() - 1)).append(" ");
        }
        ans.deleteCharAt(ans.length() - 1);

        return String.valueOf(ans);
    }
}
