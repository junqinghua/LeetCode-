public class Add_Two_Numbers2 {
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;

        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        //定义一个int sum用来储存l1+l2的值
        int sum = 0;
        //定义一个int carry用来记录是否需要进一位
        int carry = 0;

        while (l1 != null || l2 != null) {
            //依次遍历l1,l2将其val添加至sum中
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            //判断sum是否大于10，大于的话carry记为1，表示需要前进一位
            if (sum >= 10) {
                sum -= 10;
                carry = 1;
            } else {
                carry = 0;
            }

            dummy.next = new ListNode(sum);
            dummy = dummy.next;
            //将sum初始化为carry的值 1
            sum = carry;
        }
        //不能忘记最后的一个sum如果超过10，末尾自动添加一个1
        if (carry == 1) {
            dummy.next = new ListNode(1);
        }


        return p.next;
    }
}