package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/5/19 20:34
 * @Description: _75_颜色分类
 * @Version 1.0.0
 */
public class _75_颜色分类 {
    public void sortColors(int[] nums) {
        int l = nums.length;
        int count = 0;
        int t;
        for (int i = 0; i < l; i++) {
            if (nums[i] == 0){
                t = nums[count];
                nums[count] = nums[i];
                nums[i] = t;
                count += 1;
            }
        }
        for (int i = count; i < l; i++) {
            if (nums[i] == 1){
                t = nums[count];
                nums[count] = nums[i];
                nums[i] = t;
                count += 1;
            }
        }
    }
}
