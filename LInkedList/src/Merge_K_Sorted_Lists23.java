import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Merge_K_Sorted_Lists23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) return null;
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((p1, p2) -> (p1.val - p2.val));
        for(ListNode head : lists){
            if(head!=null){
                pq.add(head);
            }
        }
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            p.next =node;
            if(node.next!=null){
                pq.add(node.next);
            }
            p=p.next;


        }
        return dummy.next;
    }
}
