package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
 * answer.length == nums.length.
 * answer[i] = |leftSum[i] - rightSum[i]|.
 *
 * Where:
 * leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
 * rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
 *
 *
 * Return the array answer.
 */
public class LeftAndRightSumDifferences {
    public int[] leftRigthDifference(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            rightSum -= value;
            nums[i] = Math.abs(leftSum - rightSum);
            leftSum += value;
        }
        return nums;
    }
}
