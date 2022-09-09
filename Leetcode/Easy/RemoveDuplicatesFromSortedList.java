package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given the head of a sorted linked list,
 * delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 */

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode sHead = new ListNode();
        ListNode node = head;
        ListNode sTail = sHead;

        while (node != null) {
            while (node.next != null && node.next.val == node.val) {
                node = node.next;
            }

            ListNode next = node.next;
            node.next = null;
            sTail.next = node;
            sTail = node;
            node = next;
        }

        return sHead.next;
    }
}
