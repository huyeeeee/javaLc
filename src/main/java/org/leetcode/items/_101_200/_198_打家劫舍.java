package org.leetcode.items._101_200;

/**
 * @Author: hujiangping
 * @Date: 2023/6/8 23:43
 * @Description: _198_打家劫舍
 * @Version 1.0.0
 */
public class _198_打家劫舍 {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int length = nums.length;
        int d1 = 0;
        int d2 = nums[0];
        for (int i = 2; i <= length; i++) {
            int t = d2;
            d2 = Math.max(d2, d1 + nums[i - 1]);
            d1 = t;
        }
        return d2;
    }
}