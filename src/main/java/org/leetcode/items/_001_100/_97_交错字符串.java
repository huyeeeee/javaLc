package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/6/2 09:25
 * @Description: _97_交错字符串
 * @Version 1.0.0
 */
public class _97_交错字符串 {
    public boolean isInterleave(String s1, String s2, String s3) {

        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        if (l1 + l2 != l3) return false;
        boolean[][] dp = new boolean[l1+1][l2+1];
        dp[0][0] = true;
        for (int i = 0; i <= l1; i++) {
            for (int j = 0; j <= l2; j++) {
                int k = i + j - 1;
                if (i > 0){
                    dp[i][j] = dp[i][j] || (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(k));
                }
                if (j > 0){
                    dp[i][j] = dp[i][j] || (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(k));
                }
            }
        }
        return dp[l1][l2];
    }
}
