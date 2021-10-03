package com.example.easy;

import com.example.common.ListNode;

public class Solution_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        ListNode temp = headA;
        while(temp != null){
            lengthA++;
            temp = temp.next;
        }
        temp = headB;
        while(temp != null){
            lengthB++;
            temp = temp.next;
        }
        int diff = Math.abs(lengthA - lengthB);
        if(lengthA > lengthB){
            int i = 0;
            while(i < diff){
                headA = headA.next;
                i++;
            }
            while(headA != headB){
                headA = headA.next;
                headB = headB.next;
            }
            return headA;
        } else {
            int i = 0;
            while(i < diff){
                headB = headB.next;
                i++;
            }
            while(headA != headB){
                headA = headA.next;
                headB = headB.next;
            }
            return headA;
        }
    }
}
