import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combination_Sum_III216 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> ls = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(k, n, 1, 0);
        return res;
    }

    void backTracking(int k, int n, int startIndex, int sum) {
        if (sum > n) {
            return;
        }
        if (k == ls.size()) {
            if (sum == n) {
                res.add(new ArrayList<>(ls));
                return;
            }
        }

        for (int i = startIndex; i <= 9 - (k - ls.size()) + 1; i++) {
            ls.add(i);
            sum += i;
            backTracking(k, n, i + 1, sum);
            ls.removeLast();
            sum -= i;
        }
    }
}
