public class Reorder_List143 {
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
        public void reorderList(LinkedNode head) {
            if(head==null) return;
            //先找到中点，参考876
            LinkedNode slow = head;
            LinkedNode fast = head;
            while(fast!=null&&fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            //接着反转链表 参考206
            LinkedNode prev = null;
            LinkedNode cur =  slow;
            LinkedNode temp = null;
            while(cur!=null){
                temp = cur.next;
                cur.next =prev;
                prev =cur;
                cur=temp;
            }
            //最后合并两个链表
            LinkedNode first = head;
            LinkedNode second =prev;
            while(second.next!=null){
                temp =first.next;
                first.next=second;
                first=temp;

                temp = second.next;
                second.next=first;
                second=temp;


            }

        }

}
