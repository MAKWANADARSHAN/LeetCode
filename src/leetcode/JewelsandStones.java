package leetcode;

public class JewelsandStones {
    public int numJewelsInStones(String jewels, String stones) {
        int[] set = new int[128];
        int ans = 0;

        for (char ch : jewels.toCharArray()) {
            set[ch] = 1;
        }

        for (char ch : stones.toCharArray()) {
            if (set[ch] == 1) {
                ans++;
            }
        }
        return ans;
    }
}
