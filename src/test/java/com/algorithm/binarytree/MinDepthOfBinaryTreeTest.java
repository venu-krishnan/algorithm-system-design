package com.algorithm.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinDepthOfBinaryTreeTest {

    @Test
    public void testMinDepth() {

        TreeNode rootNode = new TreeNode(1, new TreeNode(1), null);
//        assertEquals(2, MinDepthOfBinaryTree.minDepth(rootNode));
//
//        rootNode = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
//        assertEquals(2, MinDepthOfBinaryTree.minDepth(rootNode));
//
//        rootNode = new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))));
//        assertEquals(5, MinDepthOfBinaryTree.minDepth(rootNode));

        rootNode = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        assertEquals(2, MinDepthOfBinaryTree.minDepth(rootNode));

    }

}
