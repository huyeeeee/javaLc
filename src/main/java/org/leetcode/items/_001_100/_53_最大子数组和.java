package org.leetcode.items._001_100;

/**
 * @Auther: hujiangping
 * @Date: 2023/5/3 15:45
 * @Description: _53_最大子数组和
 * @Version 1.0.0
 */
public class _53_最大子数组和 {
    public int maxSubArray1(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i-1] < 0 ? nums[i] : dp[i-1] + nums[i];
            max = Math.max(max,dp[i]);
        }
        return max;

    }
    public int maxSubArray(int[] nums) {
        int pre = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre = pre < 0 ? nums[i] : pre + nums[i];
            max = Math.max(max,pre);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new _53_最大子数组和().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
