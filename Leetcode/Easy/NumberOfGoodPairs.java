package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given an array of integers nums, return the number of good pairs.
 *
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (value == nums[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
