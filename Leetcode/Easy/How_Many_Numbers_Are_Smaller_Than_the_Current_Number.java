package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 *
 * Return the answer in an array.
 */
public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int max = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    max++;
                }
            }
            array[i] = max;
        }
        return array;
    }
}
