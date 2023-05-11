package Leetcode_and_Hackerrank.Leetcode.Medium;

/**
 * You are given an integer array nums.
 * You are initially positioned at the array's first index,
 * and each element in the array represents your maximum jump length at that position.
 *
 * Return true if you can reach the last index, or false otherwise.
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int result = nums.length - 1;
        for (int i = result; i >= 0; i--) {
            if (nums[i] + i >= result) {
                result = i;
            }
        }
        return result == 0;
    }
}
