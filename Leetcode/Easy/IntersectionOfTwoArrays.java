package Leetcode_and_Hackerrank.Leetcode.Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> temp = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        for (Integer i : set1) {
            if (set2.contains(i)) {
                temp.add(i);
            }
        }
        int[] answer = new int[temp.size()];
        int index = 0;
        for (Integer i : temp) {
            answer[index++] = i;
        }
        return answer;
    }
}
