package com.example.medium;

import com.example.common.ListNode;

public class Solution_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int length = 0;
        ListNode curr = head;
        ListNode tail = null;
        while(curr != null) {
            length++;
            if(curr.next == null) tail = curr;
            curr = curr.next;
        }
        int x = k % length;
        if(x == 0) return head;
        ListNode curr1 = head;
        int step = length - x - 1;
        while(step-->0){
            curr1=curr1.next;
        }
        ListNode newHead = curr1.next;
        curr1.next = null;
        tail.next = head;
        return newHead;
    }
}
