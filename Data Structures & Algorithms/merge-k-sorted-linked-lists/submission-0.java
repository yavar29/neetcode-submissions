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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for(ListNode h: lists){
            if(h!=null) minHeap.add(h);
        }

        ListNode dummy = new ListNode(0);
        ListNode head=dummy;
        while(!minHeap.isEmpty()){
            ListNode node = minHeap.poll();
            head.next = node;
            head= head.next;
            if(node.next!=null){
                minHeap.add(node.next);
            }
        }
        return dummy.next;

    }
}