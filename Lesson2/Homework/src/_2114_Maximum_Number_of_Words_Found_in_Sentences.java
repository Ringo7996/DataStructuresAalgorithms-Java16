public class _2114_Maximum_Number_of_Words_Found_in_Sentences {
    public int mostWordsFound(String[] sentences) {
        int wordNum = 1;
        for (int i = 0; i < sentences.length; i++) {
            int count = 1;
            for (int j = 0; j < sentences[i].length(); j++) {
                if (Character.isSpaceChar(sentences[i].charAt(j))) {
                    count++;
                }
            }
            if (count > wordNum) {
                wordNum = count;
            }
        }
        return wordNum;
    }
}
