package org.leetcode.items._201_300;

/**
 * @Author: hujiangping
 * @Date: 2023/6/8 23:41
 * @Description: _209_长度最小的子数组
 * @Version 1.0.0
 */
public class _209_长度最小的子数组 {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        while (l < nums.length && r < nums.length) {
            if (count < target) {
                count += nums[r];
                r += 1;
            } else {
                min = Math.min(min, r - l);
                count -= nums[l++];
            }
        }
        while (count >= target){
            min = Math.min(min, r - l);
            count -= nums[l++];
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
