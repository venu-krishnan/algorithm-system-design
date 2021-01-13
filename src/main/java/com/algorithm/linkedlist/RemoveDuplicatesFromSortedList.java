package com.algorithm.linkedlist;

/**
 Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
 leaving only distinct numbers from the original list. Return the linked list sorted as well.
 */
public class RemoveDuplicatesFromSortedList {

    /**
     * Big O
     * runtime: O(n)
     * space: O(1)
     **
     */ //11.03
    public static ListNode removeDuplicates(ListNode rootNode) {

        return sortListNode(rootNode);
    }

    private static ListNode sortListNode(ListNode root) {
        ListNode returnNode = new ListNode(0);//dummy

        while (root != null) {


        }
        return returnNode;
    }


}


