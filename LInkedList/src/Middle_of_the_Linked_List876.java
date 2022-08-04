public class Middle_of_the_Linked_List876 {
    public LinkedNode middleNode(LinkedNode head) {
       //快慢指针，快指针走两步，慢指针走一步，当快指针到终点时，慢指针正好到一半位置
        LinkedNode slow = head;
        LinkedNode fast = head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
}
