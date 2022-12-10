import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combinations77 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> ls = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {

        backTracking(n, k, 1);
        return res;
    }

    void backTracking(int n, int k, int startIndex) {
        if (k == ls.size()) {
            res.add(new ArrayList<>(ls));
            return;
        }
        for (int i = startIndex; i <= n - (k - ls.size()) + 1; i++) {
            ls.add(i);
            backTracking(n, k, i + 1);
            ls.removeLast();

        }

    }
}
