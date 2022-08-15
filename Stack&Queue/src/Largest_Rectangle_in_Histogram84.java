import java.util.Stack;

public class Largest_Rectangle_in_Histogram84 {
    public int largestRectangleArea(int[] heights) {
        int[] newHeights = new int[heights.length + 2];
        newHeights[0] = 0;
        newHeights[newHeights.length - 1] = 0;
        for (int i = 0; i < heights.length; i++) {
            newHeights[i + 1] = heights[i];
        }
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int area = 0;

        for (int i = 1; i < newHeights.length; i++) {
            if (newHeights[i] > newHeights[st.peek()]) {
                st.push(i);
            } else if (newHeights[i] == newHeights[st.peek()]) {
                st.pop();
                st.push(i);
            } else {
                while (!st.isEmpty() && newHeights[i] < newHeights[st.peek()]) {
                    int mid = st.peek();
                    st.pop();
                    int left = st.peek();
                    int width = i - left - 1;
                    int height = newHeights[mid];
                    area = Math.max(area, width * height);
                }
            }
            st.push(i);
        }
        return area;
    }
}
