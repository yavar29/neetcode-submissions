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
        ListNode head1=head;
        ListNode slow= head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2 = reverseList(slow.next);
        slow.next=null;
        merge(head1,head2);

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode temp=head;

        while(head!=null){
            temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;

    }

    private void merge(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            ListNode n1 = l1.next; 
            ListNode n2 = l2.next; 

            l1.next = l2;     
            l2.next = n1;          
            l1 = n1;               
            l2 = n2;               
        }
    }


}