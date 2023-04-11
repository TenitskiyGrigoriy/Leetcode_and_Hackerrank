package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
 * The returned integer should be non-negative as well.
 *
 * You must not use any built-in exponent function or operator.
 */
public class SqrtX {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int first = 1, last = x;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return last;
    }
}
