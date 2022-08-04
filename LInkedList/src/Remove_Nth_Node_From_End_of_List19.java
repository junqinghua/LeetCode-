public class Remove_Nth_Node_From_End_of_List19 {
    public LinkedNode removeNthFromEnd(LinkedNode head, int n) {
        LinkedNode dummy = new LinkedNode(-1);
        dummy.next = head;
        //找到倒数的点，将指针指向next.next的节点，完成remove
        LinkedNode res = find(dummy, n + 1);
        res.next = res.next.next;
        return dummy.next;
    }

    //写一个 find 方法 先找到倒数第N个的节点（双指针）
    public LinkedNode find(LinkedNode head, int n) {
        LinkedNode temp1 = head;
        for (int i = 0; i < n; i++) {
            temp1 = temp1.next;
        }
        LinkedNode temp2 = head;
        while (temp1 != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp2;
    }

}

