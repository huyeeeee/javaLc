package org.leetcode.items._001_100;

/**
 * @Auther: hujiangping
 * @Date: 2023/5/3 16:23
 * @Description: _62_不同路径
 * @Version 1.0.0
 */
public class _62_不同路径 {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0;i< m;i++){
            dp[i][0] = 1;
        }
        for(int i = 0;i< n;i++){
            dp[0][i] = 1;
        }
        for(int i = 1;i< m;i++){
            for(int j = 1;j< n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
