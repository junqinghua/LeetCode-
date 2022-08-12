import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_II503 {

    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        if (nums.length <= 1) {
            return new int[]{-1};
        }
        int[] res = new int[len];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(res, -1);
        st.push(0);
        for (int i = 1; i < len * 2; i++) {
            while (!st.isEmpty() && nums[i%len] > nums[st.peek()]) {
                res[st.peek()] = nums[i%len];
                st.pop();
            }

            st.push(i%len);
        }


return res;
    }
}
