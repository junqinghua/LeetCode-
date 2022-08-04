import java.util.HashMap;

class LinkedNode {
    int val;
    int key;
    LinkedNode pre;
    LinkedNode next;

    LinkedNode() {
    }

    LinkedNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}


class LRUCache {
    int size;
    HashMap<Integer, LinkedNode> map = new HashMap<>();
    int capacity;
    LinkedNode head = new LinkedNode(0, 0);
    LinkedNode tail = new LinkedNode(0, 0);

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.pre = head;
    }


    public int get(int key) {
        if (map.containsKey(key)) {
            LinkedNode res = map.get(key);
            moveToTop(res);
            return res.val;
        } else {
            return -1;
        }

    }

    public void put(int key, int value) {
        if (!map.containsKey(key)) {
            if (map.size() == capacity) {
                deleteLast();
            }
            LinkedNode newNode = new LinkedNode(key, value);
            LinkedNode temp = head.next;
            head.next = newNode;
            newNode.next = temp;
            newNode.pre = head;
            temp.pre = newNode;
            map.put(key, newNode);
        } else {
            LinkedNode p = map.get(key);
            p.val = value;
            moveToTop(p);
        }
    }

    public void deleteLast() {
        LinkedNode last = tail.pre;
        last.pre.next = tail;
        tail.pre = last.pre;
        map.remove(last.key);

    }

    public void moveToTop(LinkedNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
        LinkedNode temp = head.next;
        head.next = node;
        node.pre = head;
        node.next = temp;
        temp.pre = node;

    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */





