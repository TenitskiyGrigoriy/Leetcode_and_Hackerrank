package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int firstNumber = a.length() - 1;
        int secondNumber = b.length() - 1;
        int carry = 0;
        while (firstNumber >= 0 || secondNumber >= 0) {
            int sum = carry;
            if (firstNumber >= 0) {
                sum += a.charAt(firstNumber--) - '0';
            }
            if (secondNumber >= 0) {
                sum += b.charAt(secondNumber--) - '0';
            }
            carry = sum > 1 ? 1 : 0;
            result.append(sum % 2);
        }

        if (carry != 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
