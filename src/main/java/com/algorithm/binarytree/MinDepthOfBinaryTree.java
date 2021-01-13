package com.algorithm.binarytree;

public class MinDepthOfBinaryTree {

    /**
     * Big O
     * runtime: O(n)
     * space: O(n)
     *
     */
    public static int minDepth(TreeNode root) {
        //circuitBreaker = false;
        return findDepth(root,0);
    }
    //private static boolean circuitBreaker = false;
    private static int findDepth(TreeNode node, int count) {
        if(node == null)
            return count;
        count++;
        if(node.left == null && node.right == null) { //if leaf
//            circuitBreaker = true;
            return count;
        }
        int left = findDepth(node.left, count);
        int right = findDepth(node.right, count);
        return count;
    }
}
