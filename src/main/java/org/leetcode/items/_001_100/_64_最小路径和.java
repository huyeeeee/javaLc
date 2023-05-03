package org.leetcode.items._001_100;

/**
 * @Auther: hujiangping
 * @Date: 2023/5/3 16:49
 * @Description: _64_最小路径和
 * @Version 1.0.0
 */
public class _64_最小路径和 {
    public int minPathSum(int[][] g) {
        int[][]dp = new int[g.length][g[0].length];
        dp[0][0] = g[0][0];
        for (int i = 1; i < g.length; i++) {
            dp[i][0] = dp[i-1][0] + g[i][0];
        }
        for (int i = 1; i < g[0].length; i++) {
            dp[0][i] = dp[0][i-1] + g[0][i];
        }
        for (int i = 1; i < g.length; i++) {
            for (int j = 1; j < g[0].length; j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + g[i][j];
            }
        }
        return dp[g.length-1][g[0].length - 1];
    }
}
