import java.util.Stack;

public class Trapping_Rain_Water42 {

    public int trap(int[] height) {
        if (height.length <= 2) {
            return 0;
        }
        int sum = 0;
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (int i = 1; i < height.length; i++) {
            int stTop = st.peek();
            if (height[i] < height[stTop]) {
                st.push(i);
            } else if (height[i] == height[stTop]) {
                st.pop();
                st.push(i);
            } else {
                int heightAtIndex = height[i];
                while (!st.isEmpty() && heightAtIndex > height[stTop]) {
                    int mid = st.pop();
                    if (!st.isEmpty()) {
                        int left = st.peek();
                        int h = Math.min(height[left], heightAtIndex) - height[mid];
                        int w = i - left - 1;
                        int area = h * w;
                        if (area > 0) {
                            sum += area;
                            stTop = st.peek();
                        }
                    }
                }
            }
            st.push(i);
        }
        return sum;
    }
}
