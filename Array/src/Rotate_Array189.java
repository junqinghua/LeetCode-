public class Rotate_Array189 {
    public void rotate(int[] nums, int k) {
        //不论向左边还是右边，反正就是注意寻找反转的顺序
        //rotate whole array 注意陷阱：如果k的长度大于nums的长度的话 其实就是移动k%num长度的步数

        if (k > nums.length) {
            k = k % nums.length;
        }
        rotateArray(nums, 0, nums.length - 1);
        rotateArray(nums, 0, k - 1);
        rotateArray(nums, k, nums.length - 1);
    }

    void rotateArray(int[] nums, int i, int j) {
        while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}

