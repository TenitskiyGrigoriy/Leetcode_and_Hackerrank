package Leetcode_and_Hackerrank.Leetcode.Easy;

public class CheckIfWordEqualsSummationOfTwoWords {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return stringToNumber(firstWord) + stringToNumber(secondWord) == stringToNumber(targetWord);
    }

    public static Integer stringToNumber(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            newStr.append(str.charAt(i) - 'a');
        }
        return Integer.valueOf(newStr.toString());
    }

}
