public class Remove_Nth_Node_From_End_of_List19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        //找到倒数的点，将指针指向next.next的节点，完成remove
        ListNode res = find(dummy, n + 1);
        res.next = res.next.next;
        return dummy.next;
    }

    //写一个 find 方法 先找到倒数第N个的节点（双指针）
    public ListNode find(ListNode head, int n) {
        ListNode temp1 = head;
        for (int i = 0; i < n; i++) {
            temp1 = temp1.next;
        }
        ListNode temp2 = head;
        while (temp1 != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp2;
    }

}

