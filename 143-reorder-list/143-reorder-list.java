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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
        {
            return;
        }

        ListNode mid=middleNode(head);
        ListNode hs=reverseList(mid);

        ListNode hf=head;

        //rearrange
        while(hf!=null && hs!=null)
        {
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }

        // next of tail to null
        if(hf!=null)
        {
            hf.next=null;
        }
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
}