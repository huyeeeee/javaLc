package org.leetcode.items._201_300;

public class _238_除自身以外数组的乘积 {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int l = 1,r = 1;
        for (int i = 0; i < res.length; i++) {
            res[i] = l;
            l *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= r;
            r *= nums[i];
        }
        return res;
    }
}
