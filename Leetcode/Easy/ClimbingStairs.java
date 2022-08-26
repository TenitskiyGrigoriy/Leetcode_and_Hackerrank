package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 *You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] steps = new int[n + 1];
        steps[0] = 1;
        steps[1] = 1;

        for (int i = 2; i <= n; ++i) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }
        return steps[n];
    }
}
