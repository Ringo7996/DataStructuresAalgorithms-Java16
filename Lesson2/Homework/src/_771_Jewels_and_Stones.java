public class _771_Jewels_and_Stones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (Character.valueOf(jewels.charAt(i)) == Character.valueOf(stones.charAt(j))) {
                    count++;
                }
            }
        }
        return count;
    }
}
