import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class subsets78 {
    LinkedList<Integer> path = new LinkedList<>();
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length == 0) {
            return res;
        }
        backtracking(nums, 0);
        return res;
    }
//记录路径
    void backtracking(int[] nums, int startIndex) {
        res.add(new ArrayList(path));
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backtracking(nums, i + 1);
            path.removeLast();
        }
    }
}
