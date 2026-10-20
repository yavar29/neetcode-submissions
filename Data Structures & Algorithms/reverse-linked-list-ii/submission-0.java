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


// Definition for a Linked List node
// class ListNode {
//     int val;
//     ListNode next;

//     // Constructor
//     public ListNode(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }



class Solution
{
    public ListNode reverseBetween(ListNode head, int left, int right)
    {
        // Replace this placeholder return statement with your code
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        
        ListNode prevBefore = dummy;
        ListNode curr= head;
        while(--left>0){
            right--;
            prevBefore=prevBefore.next;
            curr=curr.next;
        }
        
        ListNode newHead=curr;
        ListNode prev=null;
        while(right-->0){
            ListNode nextNode= curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        
        prevBefore.next=prev;
        newHead.next=curr;
        
        return dummy.next;
        
    }
}