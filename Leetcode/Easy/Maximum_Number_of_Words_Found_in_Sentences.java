package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 *
 * You are given an array of strings sentences, where each sentences[i] represents a single sentence.
 *
 * Return the maximum number of words that appear in a single sentence.
 */
public class Maximum_Number_of_Words_Found_in_Sentences {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] array = sentences[i].split(" ");
            if (array.length > max) {
                max = array.length;
            }
        }
        return max;
    }
}