public class Merge_Two_Sorted_Lists21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       //虚拟头节点，完美解决需要移动头部节点的问题
        ListNode dummy = new ListNode(-1); ListNode p = dummy;
        ListNode p1 = list1;
        ListNode p2 = list2;
        while(p1!=null&&p2!=null){
            if(p1.val>p2.val){
                p.next=p2;
                p2=p2.next;
            }else{
                p.next=p1;
                p1=p1.next;
            }
            p=p.next;
        }
        //当l1或l2其中一个到头后就无法比较另一个（因为值为null） 所以要单独再添加一下
        if(p1!=null){
            p.next=p1;
        }
        if(p2!=null){
            p.next=p2;
        }


        return dummy.next;
    }
}
