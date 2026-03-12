package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        String[] ans = new String[words.length];
        int index = 0;
        HashSet<Character> set1 = new HashSet<>();
        for (char ch : row1.toCharArray()) {
            set1.add(ch);
        }

        HashSet<Character> set2 = new HashSet<>();
        for (char ch : row2.toCharArray()) {
            set2.add(ch);
        }

        HashSet<Character> set3 = new HashSet<>();
        for (char ch : row3.toCharArray()) {
            set3.add(ch);
        }
        for (String word : words) {
            String s = word.toLowerCase();
            boolean flagRow1 = true;
            boolean flagRow2 = true;
            boolean flagRow3 = true;

            for (char ch : s.toCharArray()) {
                if (!set1.contains(ch)) {
                    flagRow1 = false;
                }
                if (!set2.contains(ch)) {
                    flagRow2 = false;
                }
                if (!set3.contains(ch)) {
                    flagRow3 = false;
                }
            }
            if (flagRow1 || flagRow2 || flagRow3) {
                ans[index++] = word;
            }
        }
        return Arrays.copyOf(ans, index);
    }
}
