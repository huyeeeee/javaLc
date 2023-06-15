package org.leetcode.items._201_300;

/**
 * @Author: hujiangping
 * @Date: 2023/6/15 23:51
 * @Description: _268_丢失的数字
 * @Version 1.0.0
 */
public class _268_丢失的数字 {
    public int missingNumber(int[] nums) {
        int count = 0;
        for (int i = 0; i <= nums.length; i++) {
            if (i < nums.length){
                count -= nums[i];
            }
            count += i;
        }
        return count;
    }
}
