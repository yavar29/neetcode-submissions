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
        if (head == null) return null;

        int len = findLen(head);
        if (len == n) return head.next;    // remove head

        // move to (len - n - 1)-th node: the node before the one to delete
        ListNode curr = head;
        for (int i = 0; i < len - n - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    private int findLen(ListNode head){
        int count = 0;
        for (ListNode t = head; t != null; t = t.next) count++;
        return count;
    }
}

