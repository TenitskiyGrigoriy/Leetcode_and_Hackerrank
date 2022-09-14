package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * For example, 121 is a palindrome while 123 is not.
 */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;
        while (x > 0) {
            int value = x % 10;
            x = x / 10;
            reverse = reverse * 10 + value;
        }

        return reverse == original;
    }
}
