import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Combination_Sum_II40 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> ls = new LinkedList<>();
    int sum;
    boolean[] used;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        used = new boolean[candidates.length];
        Arrays.fill(used, false);
        Arrays.sort(candidates);
        backtracking(candidates, target, 0);
        return res;
    }


    void backtracking(int[] candidates, int target, int index) {
        if (sum == target) {
            res.add(new ArrayList<>(ls));
        }
        for (int i = index; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                break;
            }
            if (i > 0 && candidates[i] == candidates[i - 1] && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            ls.add(candidates[i]);
            sum += candidates[i];
            backtracking(candidates, target, i + 1);
            sum -= candidates[i];
            used[i] = false;
            ls.removeLast();
        }
    }
}
