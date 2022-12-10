public class Palindrome_Linked_List234 {
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
        //将整个链表转换进数组。数组里判断即可
        public boolean isPalindrome(ListNode head) {
            int len = 0;
            ListNode cur = head;
            while (cur != null) {
                len++;
                cur = cur.next;
            }
            cur = head;
            int[] res = new int[len];
            for (int i = 0; i < res.length; i++) {
                res[i] = cur.val;
                cur = cur.next;
            }
            for (int i = 0, j = len - 1; i < j; i++, j--) {
                if (res[i] != res[j]) {
                    return false;
                }
            }
            return true;
        }
    }
}
