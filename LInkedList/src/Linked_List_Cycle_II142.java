import java.util.HashSet;

public class Linked_List_Cycle_II142 {
    //解法1 hashset  与之前判断环一样，遍历整个链表并添加至hashset，当添加的元素在哈希表中已经contain了的话，返回当前node
    public ListNode detectCycle(ListNode head){
        if(head==null) return null;

        HashSet<ListNode> hs = new HashSet<ListNode>();

        while(head!=null&&head.next!=null){
            if(hs.contains(head)){
                return head;
            }else{
                hs.add(head);
            }
            head=head.next;

        }

        return null;
    }

    //解法2 双指针
   //这部分代码与判断环形部分一样
    if(head==null) return null;
     ListNode fast = head;
    ListNode slow = head;
    while(fast!=null&&fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow) break;
    }
    //遇到空指针 说明无连接 返回null
    if(fast==null||fast.next==null)return null;
//慢指针重新指向头部，与快指针同时一步步前进，相交时则为环起点
    slow =head;
    while(slow!=fast){
        slow=slow.next;
        fast=fast.next;

    }
return slow;
}
