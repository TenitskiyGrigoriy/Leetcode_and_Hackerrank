package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i^th customer has in the j^th bank.
 * Return the wealth that the richest customer has.
 *
 * A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
 */
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            if (temp >= max) {
                max = temp;
            }
        }
        return max;
    }
}
