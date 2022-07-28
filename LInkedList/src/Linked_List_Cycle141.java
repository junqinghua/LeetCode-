public class Linked_List_Cycle141 {
    public boolean hasCycle(ListNode head) {
//解法1  哈希表特性 遍历整个链表，将遍历到的加入set，如果遇到重复的则返回true。
        Set<ListNode> ls = new HashSet<>();
        if (head == null) return false;

        while (head != null && head.next != null) {
            if (!ls.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    //解法2  快慢指针 指针在链表中游走， 若相遇（相等）则说明该链表为环形链表
     if(head ==null)return false;
    ListNode slow = head;
    ListNode fast = head;

    while(fast!=null&&fast.next!=null)

    {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            return true;
        }
        return false;
    }


}
