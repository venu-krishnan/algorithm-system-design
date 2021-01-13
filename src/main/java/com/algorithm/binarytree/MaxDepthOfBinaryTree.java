package com.algorithm.binarytree;

public class MaxDepthOfBinaryTree {

    /**
     * Big O
     * runtime: O(n)
     * space: O(n)
     *
     */
    public static int maxDepth(TreeNode root) {
        return findDepth(root,0);
    }

    private static int findDepth(TreeNode node, int count) {
        if(node == null)
            return count;
        count++;
        int left = findDepth(node.left, count);
        int right = findDepth(node.right, count);
        return Math.max(left, right);
    }

}
