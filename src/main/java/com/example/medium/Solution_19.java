package com.example.medium;

import com.example.common.ListNode;

public class Solution_19 {
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        if(head.next == null) return head.next;
        int count = 0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null) {
            if(count < n) {
                count ++;
                fast = fast.next;
            } else {
                slow = slow.next;
                fast = fast.next;
            }
        }
        if(count == n-1) return head.next;
        if(count < n-1) return null;
        slow.next = slow.next.next;
        return head;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode first=head;
        ListNode second=null;
        while(n-->0){
            first=first.next;
        }
        if(first==null) return head.next;
        while(first!=null){
            first=first.next;
            if(second==null) second=head;
            else second=second.next;
        }
        second.next=second.next.next;
        return head;
    }
}
