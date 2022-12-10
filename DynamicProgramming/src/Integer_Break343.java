public class Integer_Break343 {
    public int integerBreak(int n) {
        /**
         * 方法1：动态规划 dp[i]代表i的数字拆分最大乘积
         * 初始化要注意
         */
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(dp[i - j] * j, (i - j) * j));
            }
        }
        return dp[n];
    }

    /**
     * 方法2：数学思想，初始化前6个，从第七个开始 每个dp[i]都=dp[i-3]的三倍
     */
    public int integerBreak2(int n) {
        int[] dp = new int[59];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 4;
        dp[5] = 6;
        dp[6] = 9;
        for (int i = 7; i <= n; i++) {
            dp[i] = dp[i - 3] * 3;
        }
        return dp[n];
    }
}

