package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * You are given a string allowed consisting of distinct characters and an array of strings words.
 * A string is consistent if all characters in the string appear in the string allowed.
 *
 * Return the number of consistent strings in the array words.
 */
public class Count_the_Number_of_Consistent_Strings {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        for (String str : words) {
            boolean isValid = true;
            for (char ch : str.toCharArray()) {
                if (!allowed.contains(String.valueOf(ch))) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                counter++;
            }
        }
        return counter;
    }
}
