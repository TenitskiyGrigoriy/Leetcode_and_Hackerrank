package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode reverse = null;
        ListNode node = head;

        while (node != null) {
            ListNode next = node.next;
            node.next = reverse;
            reverse = node;
            node = next;
        }

        return reverse;
    }
}
