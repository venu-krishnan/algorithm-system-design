package com.showcase.problems.general;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoLists() {

        ListNode l1 = new ListNode(1,
                        new ListNode(5,
                                new ListNode(7,
                                        new ListNode(9, null))));

        ListNode l2 = new ListNode(2,
                new ListNode(4,
                        new ListNode(5,
                                new ListNode(6, null))));

        ListNode expectedNode = new ListNode(1,
                new ListNode(2,
                                new ListNode(4,
                                        new ListNode(5,
                                        new ListNode(5,
                                                new ListNode(6,
                                                        new ListNode(7,
                                                                new ListNode(9, null))))))));

        ListNode actualNode = MergeTwoSortedLists.mergeTwoLists(l1, l2);
        while(actualNode != null && expectedNode != null){
            assertEquals(actualNode.val, expectedNode.val);
            actualNode = actualNode.next;
            expectedNode = expectedNode.next;
        }

    }

}
