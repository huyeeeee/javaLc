package org.leetcode.items._201_300;

/**
 * @Author: hujiangping
 * @Date: 2023/6/13 20:17
 * @Description: _283_移动零
 * @Version 1.0.0
 */
public class _283_移动零 {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[count++] = nums[i];
            }
        }
        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
