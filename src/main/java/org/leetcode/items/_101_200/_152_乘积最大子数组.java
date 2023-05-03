package org.leetcode.items._101_200;

/**
 * @Auther: hujiangping
 * @Date: 2023/5/3 16:06
 * @Description: _152_乘积最大子数组
 * @Version 1.0.0
 */
public class _152_乘积最大子数组 {
    public int maxProduct1(int[] nums) {
        int pre = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i == j) pre = nums[i];
                else {
                    pre = pre == 0 ? nums[j] : pre * nums[j];

                }
                max = Math.max(pre,max);
            }
        }
        return max;
    }

    public int maxProduct(int[] nums) {
        int maxF = nums[0], minF = nums[0], ans = nums[0];
        int length = nums.length;
        for (int i = 1; i < length; ++i) {
            int mx = maxF, mn = minF;
            maxF = Math.max(mx * nums[i], Math.max(nums[i], mn * nums[i]));
            minF = Math.min(mn * nums[i], Math.min(nums[i], mx * nums[i]));
            ans = Math.max(maxF, ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new _152_乘积最大子数组().maxProduct(new int[]{3, -2, 4}));
    }
}
