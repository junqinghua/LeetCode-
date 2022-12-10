public class Move_Zeroes283 {
    public void moveZeroes(int[] nums) {
        //快慢指针 与27题类似 不过这里是调换位置
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}

