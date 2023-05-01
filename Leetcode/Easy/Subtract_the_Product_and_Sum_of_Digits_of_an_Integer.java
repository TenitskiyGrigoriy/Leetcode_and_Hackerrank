package Leetcode_and_Hackerrank.Leetcode.Easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 */
public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public int subtractProductAndSum(int n) {
        int digits = 1;
        int sum = 0;
        ArrayList<Integer> array = new ArrayList<>();
        do {
            array.add(n % 10);
            n = n / 10;
        } while (n > 0);
        for (Integer integer : array) {
            digits = digits * integer;
            sum = sum + integer;
        }
        return digits - sum;
    }
}
