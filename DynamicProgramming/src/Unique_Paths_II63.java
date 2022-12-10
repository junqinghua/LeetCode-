public class Unique_Paths_II63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        /**
         跟找路径不同的点在于
         1. 初始化dp时要考虑障碍存在 i 和 j上的情况 如果出现，后面直接break
         2. 循环时，考虑入口为障碍情况[i][j]=1 则直接continue
         */


        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int dp[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            dp[i][0] = 1;
        }

        for (int i = 0; i < m; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            }
            dp[0][i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (obstacleGrid[i][j] == 1) {
                    continue;
                }
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];

            }
        }
        return dp[n - 1][m - 1];
    }
}
