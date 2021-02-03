/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return(false);
        }
        ListNode fp = head.next;
        ListNode sp = head;
        while(sp != fp){
            if(fp == null || fp.next == null){
                return(false);
            }
            sp = sp.next;
            fp = fp.next.next;
        }
        return(true);
    }
}
