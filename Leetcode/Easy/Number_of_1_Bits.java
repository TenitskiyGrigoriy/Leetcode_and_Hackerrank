package Leetcode_and_Hackerrank.Leetcode.Easy;

import java.util.HashSet;
import java.util.Set;

public class Number_of_1_Bits {
    public static int hammingWeight(int n) {
        Set<String> newSet = new HashSet<>();
        int counter = 0;
        while (n != 0) {
            counter = counter + (n & 1);
            n = n >>> 1;
        }
        return counter;
    }

}
