package org.leetcode.items._001_100;

/**
 * @Auther: hujiangping
 * @Date: 2023/5/3 16:34
 * @Description: _63_不同路径II
 * @Version 1.0.0
 */
public class _63_不同路径II {
    public int uniquePathsWithObstacles(int[][] o) {
        int dp[][] = new int[o.length][o[0].length];
        for (int i = 0; i < o.length; i++) {
            if (o[i][0] == 1){
                dp[i][0] = 0;
                break;
            }else {
                dp[i][0] = 1;
            }
        }
        for (int i = 0; i < o[0].length; i++) {
            if (o[0][i] == 1){
                dp[0][i] = 0;
                break;
            }else {
                dp[0][i] = 1;
            }
        }

        for (int i = 1; i < o.length; i++) {
            for (int j = 1; j < o[0].length; j++) {
                if (o[i-1][j] == 1 && o[i][j-1] == 1) dp[i][j] = 0;
                else if (o[i-1][j] == 1) dp[i][j] = dp[i][j-1];
                else if (o[i][j-1] == 1) dp[i][j] = dp[i-1][j];
                else dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return o[o.length-1][o[0].length-1] == 1 ? 0 : dp[o.length-1][o[0].length-1];
    }
}
