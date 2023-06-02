package org.leetcode.items._101_200;

/**
 * @Author: hujiangping
 * @Date: 2023/6/2 20:47
 * @Description: _153_寻找旋转排序数组中的最小值
 * @Version 1.0.0
 */
public class _153_寻找旋转排序数组中的最小值 {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[l] <= nums[mid]) {
                if (nums[mid] < nums[r]) r = mid;
                else l = mid + 1;
            } else {
                if (nums[r] >= nums[mid]) r = mid;
                else l = mid + 1;
            }
        }
        return nums[l];
    }
}
