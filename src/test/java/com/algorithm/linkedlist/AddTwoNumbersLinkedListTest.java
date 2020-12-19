package com.algorithm.linkedlist;

import com.algorithm.linkedlist.AddTwoNumbersLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersLinkedListTest {

    @Test
    public void testAddTwoNumbersLinkedList() {

        com.algorithm.linkedlist.ListNode l1 = new com.algorithm.linkedlist.ListNode(2,
                new com.algorithm.linkedlist.ListNode(4,
                        new com.algorithm.linkedlist.ListNode(3, null)));

        com.algorithm.linkedlist.ListNode l2 = new com.algorithm.linkedlist.ListNode(5,
                new com.algorithm.linkedlist.ListNode(6,
                        new com.algorithm.linkedlist.ListNode(4, null)));

        com.algorithm.linkedlist.ListNode expectedNode = new com.algorithm.linkedlist.ListNode(7,
                new com.algorithm.linkedlist.ListNode(0,
                        new com.algorithm.linkedlist.ListNode(8, null)));

        com.algorithm.linkedlist.ListNode actualNode = AddTwoNumbersLinkedList.addTwoLists(l1, l2);

        while(actualNode != null && expectedNode != null){
            assertEquals(actualNode.val, expectedNode.val);
            actualNode = actualNode.next;
            expectedNode = expectedNode.next;
        }


    }

}
