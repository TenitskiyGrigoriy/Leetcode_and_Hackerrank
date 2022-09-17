package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        String pref = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            int j = 0;
            while (j < pref.length() && j < s.length()
                    && pref.charAt(j) == s.charAt(j)) {
                j += 1;
            }
            pref = pref.substring(0, j);
            if (pref.length() == 0) {
                return "";
            }
        }
        return pref;
    }
}
