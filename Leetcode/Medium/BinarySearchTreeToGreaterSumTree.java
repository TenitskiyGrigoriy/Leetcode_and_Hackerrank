package Leetcode_and_Hackerrank.Leetcode.Medium;

/**
 * Given the root of a Binary Search Tree (BST),
 * convert it to a Greater Tree such that every key of the original BST is changed to the original key
 * plus the sum of all keys greater than the original key in BST.
 * <p>
 * As a reminder, a binary search tree is a tree that satisfies these constraints:
 * <p>
 * * The left subtree of a node contains only nodes with keys less than the node's key.
 * * The right subtree of a node contains only nodes with keys greater than the node's key.
 * * Both the left and right subtrees must also be binary search trees.
 */
public class BinarySearchTreeToGreaterSumTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode bstToGst(TreeNode root) {
        sum(root, 0);
        return root;
    }

    private int sum(TreeNode head, int sum) {
        if (head == null) {
            return sum;
        }
        head.val += sum(head.right, sum);
        return sum(head.left, head.val);
    }
}
