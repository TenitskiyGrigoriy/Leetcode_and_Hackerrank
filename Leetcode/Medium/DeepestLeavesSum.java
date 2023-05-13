package Leetcode_and_Hackerrank.Leetcode.Medium;

/**
 * Given the root of a binary tree, return the sum of values of its deepest leaves.
 */

public class DeepestLeavesSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int deepestLeavesSum(TreeNode root) {
        int deepestLevel = findDeepestLevel(root);
        return sumOfDeepestLeaves(root, deepestLevel);
    }

    private int findDeepestLevel(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = findDeepestLevel(root.left);
        int right = findDeepestLevel(root.right);
        return 1 + Math.max(left, right);
    }

    private int sumOfDeepestLeaves(TreeNode root, int deepestLevel) {
        if (root == null) {
            return 0;
        }
        if (deepestLevel == 1) {
            return root.val;
        }
        int left = sumOfDeepestLeaves(root.left, deepestLevel - 1);
        int right = sumOfDeepestLeaves(root.right, deepestLevel - 1);
        return left + right;
    }
}
