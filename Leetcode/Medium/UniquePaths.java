package Leetcode_and_Hackerrank.Leetcode.Medium;

/**
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
 * The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
 *
 * Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 *
 * The test cases are generated so that the answer will be less than or equal to 2 * 109.
 */

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        long[][] table = new long[m][n];
        for (int i = 0; i < m; i++) {
            table[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            table[0][j] = 1;
        }

        for (int k = 1; k < m; k++) {
            for (int l = 1; l < n; l++) {
                table[k][l] = table[k - 1][l] + table[k][l - 1];
            }
        }
        return (int) table[m- 1][n - 1];
    }
}
