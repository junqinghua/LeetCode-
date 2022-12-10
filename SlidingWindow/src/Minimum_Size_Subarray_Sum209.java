public class Minimum_Size_Subarray_Sum209 {
    int sum = 0;
    int res = Integer.MAX_VALUE;
    int left = 0;

    public int minSubArrayLen(int target, int[] nums) {
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                res = Math.min(res, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
