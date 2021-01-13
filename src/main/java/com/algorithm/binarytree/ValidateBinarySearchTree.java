package com.algorithm.binarytree;

public class ValidateBinarySearchTree {

    /**
     *   Big O
     *   runtime: O(n2)
     *   space: O(1)
     */
    public static boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return isSubtreeLessThan(root.left, root.val)
                && isSubtreeGreaterThan(root.right, root.val)
                && isValidBST(root.left) && isValidBST(root.right);
    }
    private static boolean isSubtreeLessThan(TreeNode p, int val) {
        if (p == null) return true;
        return p.val < val
                && isSubtreeLessThan(p.left, val)
                && isSubtreeLessThan(p.right, val);
    }
    private static boolean isSubtreeGreaterThan(TreeNode p, int val) {
        if (p == null) return true;
        return p.val > val
                && isSubtreeGreaterThan(p.left, val)
                && isSubtreeGreaterThan(p.right, val);
    }
}

