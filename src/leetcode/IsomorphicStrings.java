package leetcode;

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> mapofS = new HashMap<>();
        HashMap<Character, Character> mapofT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (mapofS.containsKey(ch1) && mapofS.get(ch1) != ch2) {
                return false;
            }
            if (mapofT.containsKey(ch2) && mapofT.get(ch2) != ch1) {
                return false;
            }

            mapofS.put(ch1, ch2);
            mapofT.put(ch2, ch1);
        }
        return true;
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapS[c1] != mapT[c2]) {
                return false;
            }

            mapS[c1] = mapT[c2] = i + 1;
        }

        return true;
    }
}
