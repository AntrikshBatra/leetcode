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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==0)
        {
            return head;
        }
        if(head==null || head.next==null)
        {
            return null;
        }
        
        ListNode temp=head;
        int count =1;
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        if(count==n)
        {
            return head.next;
        }
        temp=head;
        int prev=count-n;
        count=1;
        while(count!=prev)
        {
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
        return head;
    }
}