public class Remove_Element283 {
    public int removeElement(int[] nums, int val) {
        //快慢指针 需要注意的是 数组的元素在内存地址中是连续的，不能单独删除数组中的某个元素，只能覆盖。

        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
