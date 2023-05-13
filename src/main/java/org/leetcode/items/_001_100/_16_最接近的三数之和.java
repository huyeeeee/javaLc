package org.leetcode.items._001_100;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author: hujiangping
 * @Date: 2023/5/10 22:03
 * @Description: _16_最接近的三数之和
 * @Version 1.0.0
 */
public class _16_最接近的三数之和 {
    public int threeSumClosest(int[] nums, int target) {
        int min1 = 100000;
        int min2 = 100000;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int mid = i + 1;
            int right = nums.length - 1;
            while (mid < right){
                int val = nums[i] + nums[mid] + nums[right];
                if (val == target) return val;
                else if (val > target) {
                    right --;
                    min2 = Math.min(min2, Math.abs(target - val));
                }else {
                    mid ++;
                    min1 = Math.min(min1, Math.abs(target - val));
                }
            }
        }
        if (min1 == min2) return target - min1;
        else if (min1 > min2) return target + min2;
        else return target - min1;
    }
}
