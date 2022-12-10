public class test6 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,1,-1};
        int res = pivotIndex(nums);
        System.out.println(res);
    }

    public static int pivotIndex(int[] nums) {
        int l = nums.length;
        int midInedx = l / 2;
        while (midInedx <= l) {
            if (findSum(nums, 0, midInedx) == findSum(nums, midInedx + 1, l)) {
                return midInedx;
            } else if (findSum(nums, 0, midInedx) > findSum(nums, midInedx + 1, l)) {
                midInedx++;

            } else {
                midInedx--;
            }
        }
        return -1;
    }

    static int findSum(int[] nums, int i, int j) {
        int sum = 0;
        for (int k = i; k < j; k++) {
            sum += nums[k];
        }
        return sum;
    }
}

