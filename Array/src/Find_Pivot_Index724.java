public class Find_Pivot_Index724 {
    public int pivotIndex(int[] nums) {
        //本来想着用二分法做的，结果看完别人做的觉得自己好蠢
        int l = nums.length;
        int resSum = 0;
        int leftSum = 0;
        int rightSum = 0;
        for (int num : nums) {
            resSum += num;
        }
        for (int i = 0; i < l; i++) {
            leftSum += nums[i];
            rightSum = resSum - leftSum + nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
