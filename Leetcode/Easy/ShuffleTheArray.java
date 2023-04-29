package Leetcode_and_Hackerrank.Leetcode.Easy;

import java.util.Arrays;

/**
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[2 * n];
        int j = 0;
        int k = n;
        for (int i = 0; i < n; i++) {
            newArray[i] = nums[j];
            i++;
            j++;
            newArray[i] = nums[k];
            k++;
        }
        return newArray;
    }
}
