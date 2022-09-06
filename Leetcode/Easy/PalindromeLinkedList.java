package Leetcode_and_Hackerrank.Leetcode.Easy;

/**
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 */

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode node = middleNode(head);
        ListNode reverse = reverseList(node);

        while (head != null && reverse != null) {
            if (head.val != reverse.val) {
                return false;
            }

            head = head.next;
            reverse = reverse.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode reverse = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = reverse;
            reverse = head;
            head = next;
        }

        return reverse;
    }

    private ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return slow;
            }
        }

        return slow;
    }
}
