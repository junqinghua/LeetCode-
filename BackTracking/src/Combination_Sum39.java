import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum39 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> ls = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates, target, 0, 0);
        return res;
    }

    void backtracking(int[] candidates, int target, int sum, int index) {
        if (sum == target) {
            res.add(new ArrayList<>(ls));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                break;
            }
            ls.add(candidates[i]);
            backtracking(candidates, target, sum + candidates[i], i);
            ls.remove(ls.size() - 1);
        }

    }
}
