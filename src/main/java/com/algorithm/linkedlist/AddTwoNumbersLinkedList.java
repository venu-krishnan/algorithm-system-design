package com.algorithm.linkedlist;

/**
 You are given two linked lists representing two non-negative numbers. The digits are
 stored in reverse order and each of their nodes contains a single digit. Add the two
 numbers and return it as a linked list.
 Input: (2  4  3) + (5  6  4)
 Output: 7  0  8 *

 */

public class AddTwoNumbersLinkedList {
    /** BruteForce
     *  runtime: O(N * N -1)
     *  space: O(2) //return indexes
     */
    public static com.algorithm.linkedlist.ListNode addTwoLists(com.algorithm.linkedlist.ListNode l1, com.algorithm.linkedlist.ListNode l2) {

        String l1Str = recursive(l1);
        String l2Str = recursive(l2);

        int diff = Math.abs(l1Str.length() - l2Str.length());

        int bigCount = l1Str.length() >= l2Str.length()
                ? l1Str.length()
                : l2Str.length();


        if(l1Str.length() != bigCount) {
            l1Str = paddingZeros(l1Str, diff);
        }
        if(l2Str.length() != bigCount) {
            l2Str = paddingZeros(l2Str, diff);
        }

        com.algorithm.linkedlist.ListNode returnNote = null;
        com.algorithm.linkedlist.ListNode previousNode = null;

        int carry = 0;
        String totalStr = "";
        for(int i = bigCount-1; i >= 0 ; i--) {

            int l1Digit = new Integer(l1Str.substring(i , i+1)).intValue();
            int l2Digit = new Integer(l2Str.substring(i , i+1)).intValue();
            int digitTotal = 0;

            digitTotal = l1Digit + l2Digit + carry;

            carry = digitTotal/10;
            int remainder = digitTotal%10 ;

            if(returnNote == null) {
                returnNote = new com.algorithm.linkedlist.ListNode(remainder, null);
                previousNode = returnNote;
            } else {
                previousNode.next = new com.algorithm.linkedlist.ListNode(remainder, null);
                previousNode = previousNode.next;
            }
        }

        if(carry > 0) {
            previousNode.next = new com.algorithm.linkedlist.ListNode(carry, null);
        }

        return returnNote;
    }

    private static String paddingZeros(String numberStr, int diff) {
        for(int i=0; i<diff; i++)
            numberStr = "0" + numberStr;
        return numberStr;
    }

    private static String recursive(com.algorithm.linkedlist.ListNode node) {
        if(node == null) {
            return "";
        } else {
            return recursive(node.next) + node.val;
        }
    }

}
