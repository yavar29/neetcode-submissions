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


public class Solution
{
    public void reorderList(ListNode head) {
        
        if (head == null || head.next == null) return;

        // Replace this placeholder return statement with your code
        
        // Step 1: find the middle using fast and slow pointers
        ListNode prevmid=null;
        ListNode fast=head;
        ListNode mid=head;
        
        while(fast!=null && fast.next!=null){
            prevmid=mid;
            mid=mid.next;
            fast=fast.next.next;
        }
        
        if (fast != null) {          // odd length
            ListNode second = mid.next;
            mid.next = null;
            mid = second;
        } else {                      // even length
            prevmid.next = null;
            
        }
        
        // Step 2: reverse the Linked List from mid
        
        mid = reverseList(mid);
        
        fast=head;
        
        while(mid!=null){
            ListNode temp1 =fast.next;
            ListNode temp2 = mid.next;
            fast.next = mid;
            mid.next = temp1;
            fast=temp1;
            mid=temp2;
        }
  }
  
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode  temp=curr.next;    //step1
            curr.next=prev;              //step2
            prev = curr;                 //step3
            curr=temp;                   //step4
        }
        return prev;
        }
}