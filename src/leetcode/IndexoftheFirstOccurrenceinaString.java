package leetcode;

public class IndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        System.out.println(strStr("leetcode","leeto"));
    }
    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        int size = needle.length();
        for (int i = 0; i <= haystack.length() - size; i++) {
            String s = haystack.substring(i, i + size);
            if (s.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
