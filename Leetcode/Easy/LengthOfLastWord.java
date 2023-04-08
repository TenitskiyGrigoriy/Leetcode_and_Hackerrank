package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal
 * substring
 *  consisting of non-space characters only.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int answer = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                answer++;
            }
            if (i == 0 || s.charAt(i - 1) == ' ' && s.charAt(i) != ' ') {
                return answer;
            }
        }
        return answer;
    }
}
