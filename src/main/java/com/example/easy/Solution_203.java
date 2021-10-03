package com.example.easy;

import com.example.common.ListNode;

public class Solution_203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode curr = head.next;
        ListNode prev = head;
        while(curr != null){
            if(curr.val != val){
                prev.next = curr;
                prev = curr;
            } else {
                prev.next = null;
            }
            curr = curr.next;
        }
        return head.val != val ? head : head.next;
    }
}
