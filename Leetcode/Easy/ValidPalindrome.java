package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * A phrase is a palindrome if,
 * after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int start = 0;
        int last = s.length() - 1;
        while (start <= last) {
            if (s.charAt(start) != s.charAt(last)) {
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
}
