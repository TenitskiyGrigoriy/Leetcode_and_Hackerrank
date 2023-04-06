package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 */
public class Find_the_Index_of_the_First_Occurrence_in_A_String {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length())
            return -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
