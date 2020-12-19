package com.algorithm.linkedlist;

public class AddTwoNumbers {

    public AddTwoNumbers() {
    }

    public com.algorithm.linkedlist.ListNode addTwoNumbers(com.algorithm.linkedlist.ListNode l1, com.algorithm.linkedlist.ListNode l2) {

        String l1Str = listNodeToString(l1);
        String l2Str = listNodeToString(l2);

        int lengthDiff = Math.abs(l1Str.length() - l2Str.length());
        int bigCount = Math.max(l1Str.length(), l2Str.length());

        if (l1Str.length() != bigCount) {
            l1Str = paddingZeros(l1Str, lengthDiff);
        }
        if (l2Str.length() != bigCount) {
            l2Str = paddingZeros(l2Str, lengthDiff);
        }

        com.algorithm.linkedlist.ListNode returnNote = null;
        com.algorithm.linkedlist.ListNode previousNode = null;

        int carry = 0;
        for (int i = bigCount - 1; i >= 0; i--) {

            int l1Digit = new Integer(l1Str.substring(i, i + 1));
            int l2Digit = new Integer(l2Str.substring(i, i + 1));
            int digitTotal = 0;

            digitTotal = l1Digit + l2Digit + carry;
            carry = digitTotal / 10;
            int remainder = digitTotal % 10;

            if (returnNote == null) {
                returnNote = new com.algorithm.linkedlist.ListNode(remainder, null);
                previousNode = returnNote;
            } else {
                previousNode.next = new com.algorithm.linkedlist.ListNode(remainder, null);
                previousNode = previousNode.next;
            }
        }
        if (carry > 0) {
            previousNode.next = new com.algorithm.linkedlist.ListNode(carry, null);
        }
        return returnNote;
    }

    private String paddingZeros(String numberStr, int diff) {
        for (int i = 0; i < diff; i++)
            numberStr = "0" + numberStr;
        return numberStr;
    }

    private String listNodeToString(com.algorithm.linkedlist.ListNode node) {
        if (node == null) {
            return "";
        } else {
            return listNodeToString(node.next) + node.val;
        }
    }
}

