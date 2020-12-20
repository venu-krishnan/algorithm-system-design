package com.algorithm.linkedlist;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public String toString(){
        return "(val:"+val +" next:"+ (next == null) +")";
    }
}
