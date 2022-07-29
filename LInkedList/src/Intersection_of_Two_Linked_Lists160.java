public class Intersection_of_Two_Linked_Lists160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //经典hashset判断一个相交（重复，一样）的点
        if(headA==null||headB==null) return null;
        Set<ListNode> visited = new HashSet<>();
        while(headA!=null){
            visited.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(visited.contains(headB)){
                return headB;
            }else{
                headB=headB.next;
            }
        }


        return null;
    }
}
