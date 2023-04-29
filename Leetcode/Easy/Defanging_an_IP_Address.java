package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 * A defanged IP address replaces every period "." with "[.]".
 */
public class Defanging_an_IP_Address {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
