package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder output = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            char c = (char) (columnNumber % 26 + 'A');

            columnNumber = columnNumber / 26;

            output.append(c);
        }

        output.reverse();
        return output.toString();
    }
}
