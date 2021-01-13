package com.algorithm.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateBinarySearchTreeTest {

    @Test
    public void testIsValidBST() {

        TreeNode rootNode = new TreeNode(1, new TreeNode(1), null);

        //System.out.println(Math.max(-80, 38));

        assertFalse(ValidateBinarySearchTree.isValidBST(rootNode));

        rootNode = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertTrue(ValidateBinarySearchTree.isValidBST(rootNode));


        rootNode = new TreeNode(2, new TreeNode(1),
                    new TreeNode(4,  new TreeNode(3),  new TreeNode(6)));
        assertTrue(ValidateBinarySearchTree.isValidBST(rootNode));


        rootNode = new TreeNode(5, new TreeNode(4, null, null), new TreeNode(6,
                new TreeNode(3),  new TreeNode(7)));
        assertFalse(ValidateBinarySearchTree.isValidBST(rootNode));

        rootNode = new TreeNode(32,
                new TreeNode(26,
                        new TreeNode(19, null, new TreeNode(27)), null),
                new TreeNode(47,
                    null, new TreeNode(56)));
        assertFalse(ValidateBinarySearchTree.isValidBST(rootNode));

        rootNode = new TreeNode(3, null ,new TreeNode(30, new TreeNode(10, null, new TreeNode(15, null, new TreeNode(45))), null));
        assertFalse(ValidateBinarySearchTree.isValidBST(rootNode));

        rootNode = new TreeNode(98, new TreeNode(-57, null, new TreeNode(58, new TreeNode(31), null)), null);
        assertTrue(ValidateBinarySearchTree.isValidBST(rootNode));

        rootNode = new TreeNode(-80, null, new TreeNode(38, new TreeNode(25, new TreeNode(-43), null), null));
        assertTrue(ValidateBinarySearchTree.isValidBST(rootNode));

    }

}
