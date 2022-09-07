package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given the head of a linked list and an integer val,
 * remove all the nodes of the linked list that has Node.val == val, and return the new head.
 */

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode sHead = new ListNode();
        ListNode sTail = sHead;
        ListNode node = head;

        while (node != null) {
            ListNode next = node.next;
            node.next = null;

            if (node.val != val) {
                sTail.next = node;
                sTail = node;
            }

            node = next;
        }

        return sHead.next;
    }
}
