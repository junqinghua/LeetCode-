import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = Arrays.copyOf(nums, nums.length);
        Arrays.sort(res);
        for (int i = 0; i < res.length; i++) {
            if (!map.containsKey(res[i])) {
                map.put(res[i], i);
            }
        }
        for (int j = 0; j < res.length; j++) {
            res[j] = map.get(nums[j]);
        }


        return res;
    }
}

