package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int i = 0;
        for (int num: nums) {
            i = i ^ num;
        }
        return i;
    }
}