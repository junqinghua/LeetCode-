import java.util.ArrayDeque;
import java.util.Deque;

public class Remove_All_Adjacent_Duplicates_In_String1047 {
    public String removeDuplicates(String s) {
        if (s == null) return null;
        Deque<Character> dq = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (dq.isEmpty() || c != dq.peek()) {
                dq.push(c);
            } else {
                dq.pop();
            }

        }
        String str = "";
        while (!dq.isEmpty()) {
            str = dq.pop() + str;
        }
        return str;

    }

}
