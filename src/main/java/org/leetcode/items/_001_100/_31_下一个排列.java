package org.leetcode.items._001_100;

import java.util.Arrays;

/**
 * @Author: hujiangping
 * @Date: 2023/5/13 16:19
 * @Description: _31_下一个排列
 * @Version 1.0.0
 */
public class _31_下一个排列 {
    public static void nextPermutation(int[] nums) {
        int l = nums.length;
        if (l <= 1) return;

        for (int i = l - 1; i >= 1; i--) {
            if (nums[i] > nums[i-1]){
                for (int j = l - 1; j >= i; j--) {
                    if (nums[j] > nums[i-1]){
                        int t = nums[j];
                        nums[j] = nums[i - 1];
                        nums[i - 1] = t;
                        break;
                    }
                }
                Arrays.sort(nums,i,l);
                return;
            }
        }
        Arrays.sort(nums);
    }

    public static void main(String[] args) {
        int[] m = {1,2,3};
        nextPermutation(m);
        System.out.println(Arrays.toString(m));
    }
}
