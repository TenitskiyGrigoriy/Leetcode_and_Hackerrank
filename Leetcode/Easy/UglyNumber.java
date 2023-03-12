package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 *
 * Given an integer n, return true if n is an ugly number.
 *
 *
 */

public class UglyNumber {
    public boolean isUgly(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        if (n % 2 == 0) {
            return isUgly(n/2);
        } else if (n % 3 == 0) {
            return isUgly(n/3);
        } else if (n % 5 == 0) {
            return isUgly(n/5);
        }
        return false;
    }
}
