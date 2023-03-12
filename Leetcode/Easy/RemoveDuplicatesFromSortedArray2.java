package Leetcode_and_Hackerrank.Leetcode.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 *
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 *
 * Return k after placing the final result in the first k slots of nums.
 *
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 */

public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int answer = set.size();
        int setLength = nums.length - set.size();
        for (int j = 0; j < setLength; j++) {
            set.add(Integer.MAX_VALUE - j);
        }

        int i = 0;
        for (int x : set) {
            nums[i] = x;
            i++;
        }

        Arrays.sort(nums);
        return answer;
    }
}
