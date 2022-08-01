public class Remove_Linked_List_Elements203 {
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
        public ListNode removeElements(ListNode head, int val) {
           //迭代
            ListNode dummy = new ListNode(-1);
            dummy.next=head;
            ListNode p =dummy;
            while(p.next!=null){
                if(p.next.val==val){
                    p.next=p.next.next;
                }
                else{
                    p=p.next;
                }
            }
            return dummy.next;
        }
}
