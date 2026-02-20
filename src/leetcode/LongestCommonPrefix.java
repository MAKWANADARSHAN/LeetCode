package leetcode;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String pre = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            int j = 0;

            while (j < pre.length() && j < s.length() && pre.charAt(j) == s.charAt(j)) {
                j++;
            }

            pre = pre.substring(0, j);

            if (pre.isEmpty()) {
                return "";
            }
        }
        return pre;
    }
}
