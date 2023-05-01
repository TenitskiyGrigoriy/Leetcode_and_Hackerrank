package Leetcode_and_Hackerrank.Leetcode.Easy;

import java.util.Arrays;

/**
 * You are given a positive integer num consisting of exactly four digits.
 * Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.
 *
 * For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3.
 * Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
 * Return the minimum possible sum of new1 and new2.
 */
public class Minimum_Sum_of_Four_Digit_Number_After_Splitting_Digits {
    public int minimumSum(int num) {
        int[] array = new int[4];
        int index = 0;
        while (num > 0) {
            array[index++] = num % 10;
            num = num / 10;
        }

        Arrays.sort(array);
        return (array[0] * 10 + array[2]) + (array[1] * 10 + array[3]);
    }
}
