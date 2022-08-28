package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing
 * a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1) {
            return 0;
        }
        int result = 0;
        int minVal = prices[0];
        for (int i = 1; i < n; i++) {
            result = Math.max(result, prices[i] - minVal);
            minVal = Math.min(minVal, prices[i]);
        }
        return result;
    }
}
