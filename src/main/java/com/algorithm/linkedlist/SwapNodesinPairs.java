package com.algorithm.linkedlist;

/**
 *
 * Given a linked list, swap every two adjacent nodes and return its head.
 * For example,
 * Given 1 -> 2 -> 3 -> 4, you should return the list as 2 -> 1 -> 4 -> 3
 * Your algorithm should use only constant space. You may not modify the values in the
 * list, only nodes itself can be changed.
 *
 */
public class SwapNodesinPairs {

    //a->b
    //a-b
    //10.09
    public static ListNode swapNodes(ListNode l1) {

        boolean skipEven = false;
        while(l1 != null) {
            System.out.println(l1);
            //if(!skipEven) {
                ListNode temp = l1; //tmp = a
                l1 = l1.next; // a = a.b
                l1.next = temp;  // a.b = a
                l1 = l1.next.next; // a = b.c =
//            } else {
//                skipEven = false;
//                l1 = l1.next.next;
//                System.out.println("2:"+l1);
//            }

            //a,b,c
            //b.next  = a;
            //a.next  = c;

        }

        return new ListNode(1, null);
    }


}
