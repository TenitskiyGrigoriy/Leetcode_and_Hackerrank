package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */

public class PalindromeNumber2 {
    public boolean isPalindrome(int x) {

        String str1 = Integer.toString(x);
        String str2 = new StringBuilder(str1).reverse().toString();

        return str1.equals(str2);
    }
}
