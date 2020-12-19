package com.algorithm;

import com.algorithm.AddTwoNumbersLinkedList;
import com.algorithm.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersLinkedListTest {

    @Test
    public void testAddTwoNumbersLinkedList() {

        ListNode l1 = new ListNode(2,
                new ListNode(4,
                        new ListNode(3, null)));

        ListNode l2 = new ListNode(5,
                new ListNode(6,
                        new ListNode(4, null)));

        ListNode expectedNode = new ListNode(7,
                new ListNode(0,
                        new ListNode(8, null)));

        ListNode actualNode = AddTwoNumbersLinkedList.addTwoLists(l1, l2);

        while(actualNode != null && expectedNode != null){
            assertEquals(actualNode.val, expectedNode.val);
            actualNode = actualNode.next;
            expectedNode = expectedNode.next;
        }


    }

}
