public class Reverse_Linked_List206 {
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
        public LinkedNode reverseList(LinkedNode head) {
            LinkedNode cur = head;
            LinkedNode pre =null;
            while(cur!=null){
                LinkedNode temp = cur.next;
                cur.next=pre;
                pre=cur;
                cur=temp;

            }
            return pre;
        }
    }

