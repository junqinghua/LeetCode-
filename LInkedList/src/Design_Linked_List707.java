class ListNode {
    int val;
    LinkedNode next;
    ListNode(){}
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val, LinkedNode next){
        this.val=val;
        this.next=next;
    }

}

class MyLinkedList {
    int size;
    LinkedNode head;

    public MyLinkedList() {
        size =0;
        head = new LinkedNode(0);
    }
    //所有index都是从0开始的，要注意
    public int get(int index) {
        if(index<0||index>=size) return -1;
        LinkedNode currentNode = head;
        for(int i=0;i<=index;i++){
            currentNode=currentNode.next;
        }
        return currentNode.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if(index>size) return;
        if(index<0) {
            index=0;
        }
        size++;
        LinkedNode node3 = new LinkedNode(val);
        LinkedNode cur = head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        node3.next=cur.next;;
        cur.next=node3;
    }

    public void deleteAtIndex(int index) {
        if(index<0||index>=size) return;
        size--;
        LinkedNode p = head;
        for(int i =0;i<index;i++){
            p=p.next;

        }
        p.next=p.next.next;


    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */




