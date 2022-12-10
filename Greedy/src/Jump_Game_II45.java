public class Jump_Game_II45 {
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return 0;
        }
        int count = 0;
        int curRange = 0;
        int maxRange = 0;
        for (int i = 0; i < nums.length; i++) {
            maxRange = Math.max(maxRange, nums[i] + i);
            if (maxRange >= nums.length - 1) {
                count++;
                break;
            }
            if (i == curRange) {
                count++;
                curRange = maxRange;
            }
        }
        return count;
    }
}
