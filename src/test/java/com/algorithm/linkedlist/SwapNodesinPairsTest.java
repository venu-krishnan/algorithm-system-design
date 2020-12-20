package com.algorithm.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwapNodesinPairsTest {

    @Test
    public void testSwapNodesInPair() {

        ListNode l1 = new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4, null))));

        ListNode expectedNode = new ListNode(2,
                            new ListNode(1,
                                new ListNode(4,
                                        new ListNode(3, null))));

        ListNode actualNode = SwapNodesinPairs.swapNodes(l1);
        while(actualNode != null && expectedNode != null){
            assertEquals(actualNode.val, expectedNode.val);
            actualNode = actualNode.next;
            expectedNode = expectedNode.next;
        }

    }

}
