package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 */

public class FibonacciNumber {
    private final int[] array = new int[31];

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (array[n] != 0) {
            return array[n];
        }
        array[n] = fib(n - 1) + fib(n - 2);
        return array[n];
    }
}
