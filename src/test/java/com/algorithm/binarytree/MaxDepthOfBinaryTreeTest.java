package com.algorithm.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxDepthOfBinaryTreeTest {

    @Test
    public void testMaxDepth() {

        TreeNode rootNode = new TreeNode(1, new TreeNode(1), null);

        assertEquals(2, MaxDepthOfBinaryTree.maxDepth(rootNode));

        rootNode = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(3, MaxDepthOfBinaryTree.maxDepth(rootNode));

    }

}
