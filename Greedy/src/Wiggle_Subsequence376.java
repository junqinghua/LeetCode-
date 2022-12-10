public class Wiggle_Subsequence376 {
    public int wiggleMaxLength(int[] nums) {
        int count = 1;
        int prediff = 0;

        for (int i = 1; i < nums.length; i++) {
            int curdiff = nums[i] - nums[i - 1];
            if ((prediff <= 0 && curdiff > 0) || (prediff >= 0 && curdiff < 0)) {
                count++;
                prediff = curdiff;
            }
        }
        return count;
    }
}