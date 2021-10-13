package com.example.medium;

import com.example.common.ListNode;

public class Solution_24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        head = head.next;
        while(curr != null && curr.next != null) {
            next = curr.next;
            curr.next = next.next;
            next.next = curr;
            if(prev != null) {
                prev.next = next;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}
