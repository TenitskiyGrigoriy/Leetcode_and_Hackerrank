package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * You own a Goal Parser that can interpret a string command.
 * The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
 * The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
 * The interpreted strings are then concatenated in the original order.
 *
 * Given the string command, return the Goal Parser's interpretation of command.
 */
public class GoalParserInterpretation {
    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                result.append("G");
            }
            if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                result.append("o");
            }
            if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                result.append("al");
            }
        }
        return result.toString();
    }
}
