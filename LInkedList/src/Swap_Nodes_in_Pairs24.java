public class Swap_Nodes_in_Pairs24 {
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
    class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode p = dummy;
            while (p.next != null && p.next.next != null) {
                ListNode temp = head.next.next;
                p.next = head.next;
                head.next.next = head;
                head.next = temp;
                p = head;
                head = head.next;
            }
            return dummy.next;
        }
    }
}