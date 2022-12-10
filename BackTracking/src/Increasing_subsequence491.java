import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Increasing_subsequence491 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new LinkedList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        if (nums.length == 0) {
            return res;
        }
        backtrack(nums, 0);
        return res;
    }

    void backtrack(int[] nums, int startIndex) {
        if (path.size() > 1) {
            res.add(new ArrayList(path));
        }
        int[] used = new int[201];
        for (int i = startIndex; i < nums.length; i++) {
            if (!path.isEmpty() && nums[i] < path.get(path.size() - 1) || used[nums[i] + 100] == 1) {
                continue;
            }
            path.add(nums[i]);
            used[nums[i] + 100] = 1;
            backtrack(nums, i + 1);
            path.remove(path.size() - 1);

        }
    }
}

