package com.example.medium;

import com.example.common.ListNode;

public class Solution_328 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode temp = even;
        int count = 2;
        for(ListNode curr = head.next.next; curr != null; curr = curr.next) {
            if(count % 2 == 0) {
                odd.next = curr;
                odd = odd.next;
            } else {
                even.next = curr;
                even = even.next;
            }
            count++;
        }
        odd.next = temp;
        even.next = null;
        return head;
    }

    //leetcode solution
    public ListNode oddEvenList1(ListNode head) {
        if (head == null) return null;
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
