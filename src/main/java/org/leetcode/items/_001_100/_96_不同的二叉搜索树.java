package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/5/9 21:48
 * @Description: _96_不同的二叉搜索树
 * @Version 1.0.0
 */
public class _96_不同的二叉搜索树 {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                dp[i] = dp[i] + dp[i - j] * dp[j - 1];
            }
        }
        return dp[n];
    }
}
