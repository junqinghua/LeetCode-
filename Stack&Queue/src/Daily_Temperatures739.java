import java.util.ArrayDeque;
import java.util.Deque;

public class Daily_Temperatures739 {
    //思路：  当要求xxx的下一个最大或最小时 要想起使用单调栈
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];

/**ArrayDeque和LinkedList 区别： AD底层结构是数组，不方便删除和添加，使用于确定长度的时候
 * LL底层链表，方便添加和删除，用于不确定长度可能随时需要添加的时候
 */
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
//单调栈内添加的是 下标
        for (int i = 1; i < len; i++) {
            if (temperatures[i] <= temperatures[stack.peek()]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    res[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
            }
            stack.push(i);
        }
        return res;
    }
}
