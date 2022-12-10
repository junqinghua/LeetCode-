public class Sort_Array_By_Parity_II922 {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                res[evenIndex] = nums[i];
                evenIndex += 2;
            } else {
                res[oddIndex] = nums[i];
                oddIndex += 2;
            }
        }
        return res;
    }
}