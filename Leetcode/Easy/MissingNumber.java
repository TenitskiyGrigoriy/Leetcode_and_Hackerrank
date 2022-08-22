package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 */

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int expected = (1 + nums.length) * nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return expected - sum;
    }
}
