/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null || head==null)
        {
            return null;
        }
        ListNode fast=head,slow=head,previous=null;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            previous=slow;
            slow=slow.next;
        }
        previous.next=previous.next.next;
        
        return head;
    }
}