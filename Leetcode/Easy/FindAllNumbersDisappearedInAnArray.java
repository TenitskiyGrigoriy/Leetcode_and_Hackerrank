package Leetcode_and_Hackerrank.Leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 */

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int ret = Math.abs(nums[i]) - 1;
            if (nums[ret] > 0) {
                nums[ret] = -nums[ret];
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > 0) {
                list.add(j + 1);
            }
        }
        return list;
    }
}
