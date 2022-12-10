public class Jump_Game55 {
    public boolean canJump(int[] nums) {
        //维护覆盖范围，如果最终目的地在覆盖范围内则返回true
        if (nums.length == 1) {
            return true;
        }
        int l = nums.length - 1;

        int coverRange = 0;
        //在覆盖范围内更新
        for (int i = 0; i <= coverRange; i++) {
            coverRange = Math.max(coverRange, nums[i] + i);
            if (nums[i] + i >= l) {
                return true;
            }
        }
        return false;
    }
}
