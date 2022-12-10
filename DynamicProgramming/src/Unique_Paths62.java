public class Unique_Paths62 {
    public int uniquePaths(int m, int n) {
        /** 确定dp下标及含义
         dp[i][j]表示从起点到 [i][j]有多少条路径
         */

        /** 确定递推公式
         dp[i][j] = dp[i-1][j]+dp[i][j-1]
         */

        /** dp初始化
         for(int i=0;i<m;i++){dp[i][0]=1;}
         for(int j=0;j<n;j++){dp[0][j]=1;}
         */

        //确定遍历顺序
        // 举例打印

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}





