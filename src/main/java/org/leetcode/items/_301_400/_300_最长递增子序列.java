package org.leetcode.items._301_400;

import java.util.Arrays;

/**
 * @Author: hujiangping
 * @Date: 2023/5/25 21:00
 * @Description: _300_最长递增子序列
 * @Version 1.0.0
 */
public class _300_最长递增子序列 {
    public int lengthOfLIS(int[] nums) {
        int res = 1;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) dp[i] = Math.max(dp[i],dp[j]+1);
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
