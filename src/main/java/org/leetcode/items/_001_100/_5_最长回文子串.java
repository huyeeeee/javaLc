package org.leetcode.items._001_100;

/**
 * @Auther: hujiangping
 * @Date: 2023/4/28 09:52
 * @Description: _5_最长回文子串
 * @Version 1.0.0
 */
public class _5_最长回文子串 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abacaba"));
    }
    public static String longestPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i = n-1;i >= 0;i--){
            for(int j = i;j < n;j++){
                if(i == j) dp[i][j] = 1;
                else if(j-i == 1) dp[i][j] = s.charAt(i) == s.charAt(j) ? 1 : 0;
                else{
                    if(dp[i+1][j-1] == 0) dp[i][j] = 0;
                    else dp[i][j] = s.charAt(i) == s.charAt(j) ? 1 : 0;
                }
            }
        }
        int maxLen = 1;
        int start = 0;
        for(int i = 0;i < n;i++){
            for(int j = i;j< n;j++){
                if(dp[i][j] == 1 && j - i + 1 > maxLen){
                    maxLen = j - i + 1;
                    start = i;
                }
            }
        }
        return s.substring(start,start + maxLen);
    }
}
