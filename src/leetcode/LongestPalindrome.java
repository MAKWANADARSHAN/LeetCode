package leetcode;


public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s.length() == 1) {
            return s.length();
        }
        int[] count = new int[128];
        int ans = 0;
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        boolean oddFound = false;
        for (int ch : count) {
            ans += (ch / 2) * 2;
            if (ch % 2 == 1) {
                oddFound = true;
            }
        }
        if (oddFound) {
            ans += 1;
        }
        return ans;
    }
}
