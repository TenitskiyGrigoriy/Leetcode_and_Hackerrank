package Leetcode_and_Hackerrank.Leetcode.Medium;

/**
 * Given an integer array nums, find the contiguous subarray
 * (containing at least one number) which has the largest sum and return its sum.
 *
 * A subarray is a contiguous part of an array.
 */

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num: nums) {
            sum = Math.max(sum, 0) + num;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
