import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Next_Greater_Element496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        //创建一个临时栈，一个哈希表，然后遍历 num2;


        int len1 = nums1.length;
        int len2 = nums2.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new LinkedList<>();
        int[] res = new int[len1];

//当前栈内有元素，则用当前数字与栈顶数字做比较，否则 当前数字入栈
        for (int i = 0; i < len2; i++) {
            while (!stack.isEmpty() && stack.peekLast() < nums2[i]) {
                map.put(stack.removeLast(), nums2[i]);
            }
            stack.addLast(nums2[i]);

        }
        //若map无对应则返回-1
        for (int i = 0; i < len1; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;

    }
}
