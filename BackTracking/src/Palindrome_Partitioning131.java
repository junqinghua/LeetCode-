import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Palindrome_Partitioning131 {
    List<List<String>> res = new ArrayList<>();
    Deque<String> q = new LinkedList<>();

    public List<List<String>> partition(String s) {
        backtracking(s, 0);
        return res;

    }


    void backtracking(String s, int index) {
        if (index >= s.length()) {
            res.add(new ArrayList<>(q));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalinadrome(s, index, i)) {
                String sub = s.substring(index, i + 1);
                q.addLast(sub);
            } else {
                continue;
            }
            backtracking(s, i + 1);
            q.removeLast();
        }
    }

    boolean isPalinadrome(String s, int index, int end) {
        for (int i = index, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
