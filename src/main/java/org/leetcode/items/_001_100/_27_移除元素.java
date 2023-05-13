package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/5/13 15:26
 * @Description: _27_移除元素
 * @Version 1.0.0
 */
public class _27_移除元素 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[count] =nums[i];
                count += 1;
            }
        }
        return count;
    }
}
