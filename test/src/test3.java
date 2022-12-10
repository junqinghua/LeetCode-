import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class test3 {

    public static void main(String[] args) {
        int[] nums = new int[]{9,9,9,1,2,3};

        long ans = function(nums, 3);
        System.out.println(ans);
    }

    public static long function(int[] nums, int k) {
        long sum = 0;
        long res = 0;
        int left = 0;
        int right = k - 1;
        int tt = 0;
        while (right < nums.length) {
            int[] temp = new int[k];
            for (int i = 0; i <= k-1; i++) {
                if(tt<=nums.length-1){
                    temp[i] = nums[tt];
                    tt++;
                }
                else{
                    break;
                }

            }

            if (repeatOrnot(temp)) {
                sum = 0;
            } else {
                for (int j = 0; j < temp.length; j++) {
                    sum += temp[j];

                }
                res = Math.max(res, sum);
                sum = 0;
            }
            left++;
            tt=left;
            right++;
        }

        return res;
    }


    public static boolean repeatOrnot(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }
}



