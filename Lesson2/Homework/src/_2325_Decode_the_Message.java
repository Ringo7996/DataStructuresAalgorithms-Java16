import java.util.ArrayList;
import java.util.Arrays;

public class _2325_Decode_the_Message {
    public String decodeMessage(String key, String message) {
        char[] chars = key.toCharArray();
        ArrayList<Character> characters = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if (!characters.contains(chars[i]) && !Character.isSpaceChar(chars[i])) {
                characters.add(chars[i]);
            }
        }
        System.out.println(Arrays.toString(characters.toArray()));

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char x;
            if (message.charAt(i) == 32) {
                x = 32;
            } else {
                characters.indexOf(message.charAt(i));
                x = (char) (characters.indexOf(message.charAt(i)) + 97);
            }
            stringBuilder.append(x);
        }

        return String.valueOf(stringBuilder);
    }
}
