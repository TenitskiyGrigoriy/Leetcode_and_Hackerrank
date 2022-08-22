package Leetcode_and_Hackerrank.Leetcode.Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (set.contains(value)) return true;
                set.add(nums[i]);
        }
        return false;
    }
}
