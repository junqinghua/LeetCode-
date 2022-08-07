import java.util.ArrayDeque;
import java.util.Deque;

public class Valid_Parentheses20 {

    public boolean isValid(String s) {
        Deque<Character> q = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                q.push(')');
            } else if (c == '{') {
                q.push('}');
            } else if (c == '[') {
                q.push(']');
            } else if (q.isEmpty() || c != q.peek()) {
                return false;
            } else {
                q.pop();
            }


        }
        return q.isEmpty();
    }
}



