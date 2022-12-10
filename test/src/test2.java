public class test2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 1, 1, 0};
        int[] num = applyOperations(nums);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static int[] applyOperations(int[] nums) {
        int left = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[left]) {
                nums[left] *= 2;
                nums[i] = 0;
                left++;
            } else {
                left++;
            }
        }
        for (int j = 1; j < nums.length; j++) {
            if (nums[j - 1] == 0) {
                nums[j-1] = nums[j];
                nums[nums.length - 1] = 0;
            }
        }

        return nums;
    }


}
