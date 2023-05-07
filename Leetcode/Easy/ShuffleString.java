package Leetcode_and_Hackerrank.Leetcode.Easy;
/**
 * You are given a string s and an integer array indices of the same length.
 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 * <p>
 * Return the shuffled string.
 */
public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] a = new char[s.length()];
        for (int i = 0; i < indices.length; i++)
            a[indices[i]] = s.charAt(i);
        StringBuilder answer = new StringBuilder();
        for (char c : a)
            answer.append(Character.toString(c));
        return answer.toString();
    }
}