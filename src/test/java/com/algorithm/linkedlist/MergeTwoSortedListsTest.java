package com.algorithm.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoLists() {

        com.algorithm.linkedlist.ListNode l1 = new com.algorithm.linkedlist.ListNode(1,
                        new com.algorithm.linkedlist.ListNode(5,
                                new com.algorithm.linkedlist.ListNode(7,
                                        new com.algorithm.linkedlist.ListNode(9, null))));

        com.algorithm.linkedlist.ListNode l2 = new com.algorithm.linkedlist.ListNode(2,
                new com.algorithm.linkedlist.ListNode(4,
                        new com.algorithm.linkedlist.ListNode(5,
                                new com.algorithm.linkedlist.ListNode(6, null))));

        com.algorithm.linkedlist.ListNode expectedNode = new com.algorithm.linkedlist.ListNode(1,
                new com.algorithm.linkedlist.ListNode(2,
                                new com.algorithm.linkedlist.ListNode(4,
                                        new com.algorithm.linkedlist.ListNode(5,
                                        new com.algorithm.linkedlist.ListNode(5,
                                                new com.algorithm.linkedlist.ListNode(6,
                                                        new com.algorithm.linkedlist.ListNode(7,
                                                                new com.algorithm.linkedlist.ListNode(9, null))))))));

        com.algorithm.linkedlist.ListNode actualNode = MergeTwoSortedLists.mergeTwoLists(l1, l2);
        while(actualNode != null && expectedNode != null){
            assertEquals(actualNode.val, expectedNode.val);
            actualNode = actualNode.next;
            expectedNode = expectedNode.next;
        }

    }

}
