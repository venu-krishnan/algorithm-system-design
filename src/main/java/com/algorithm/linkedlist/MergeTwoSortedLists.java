package com.algorithm.linkedlist;

/**
 Merge two sorted linked lists and return it as a new list. The new list should be made by
 splicing together the nodes of the first two lists.

 */
public class MergeTwoSortedLists {

    /**
     * Big O
     * runtime: O(n + n) //2 linked lists
     * space: O(1)
     **
     */
    public static com.algorithm.linkedlist.ListNode mergeTwoLists(com.algorithm.linkedlist.ListNode l1, com.algorithm.linkedlist.ListNode l2) {

        com.algorithm.linkedlist.ListNode returnNode = new com.algorithm.linkedlist.ListNode(0, null);
        com.algorithm.linkedlist.ListNode traverseNode = returnNode;
        while(l1 != null || l2 != null) {
            if(l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    traverseNode.next = l1;
                    l1 = l1.next;
                }
                else {
                    traverseNode.next = l2;
                    l2 = l2.next;
                }
                traverseNode = traverseNode.next;
            } else if(l1 != null) {
                traverseNode.next = l1;
                l1 = l1.next;
                traverseNode = traverseNode.next;
            } else if(l2 != null){
                traverseNode.next = l2;
                l2 = l2.next;
                traverseNode = traverseNode.next;
            }
        }

        return returnNode.next;
    }


}


