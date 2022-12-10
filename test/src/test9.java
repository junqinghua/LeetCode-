public class test9 {
    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }
}



