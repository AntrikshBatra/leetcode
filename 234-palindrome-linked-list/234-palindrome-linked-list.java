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
     public boolean isPalindrome(ListNode head) {
         ListNode mid=middleNode(head);
        ListNode headSecond=reverseList(mid);
        ListNode reverseHead=headSecond;

        //compare both the halves
        while(head!=null && headSecond!=null)
        {
            if(head.val!=headSecond.val)
            {
                break;
            }
            head=head.next;
            headSecond=headSecond.next;
        }
        reverseList(reverseHead);
        if( headSecond==null)
        {
            return true;
        }
        return false;
    }
    
    public ListNode reverseList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=head.next;

        while (pres!=null)
        {
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null)
            {
                next=next.next;
            }
        }

        return prev;
    }
    
     public ListNode middleNode(ListNode head) {
        ListNode s=head;
        ListNode f=head;

        while(f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
}