package Leetcode_and_Hackerrank.Leetcode.Medium;

public class MaximumSubarraySumWithOneDeletion {
    public int maximumSum(int[] arr) {
        int maxSum = arr[0];

        int[] left = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i - 1] + arr[i], arr[i]);
            maxSum = Math.max(maxSum, left[i]);
        }

        int[] right = new int[arr.length];
        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1] + arr[i], arr[i]);
        }

        for (int i = 1; i < arr.length - 1; i++) {
            maxSum = Math.max(maxSum, left[i - 1] + right[i + 1]);
        }

        return maxSum;
    }
}
