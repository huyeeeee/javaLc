package org.leetcode.items._101_200;

/**
 * @Author: hujiangping
 * @Date: 2023/6/5 23:50
 * @Description: _162_寻找峰值
 * @Version 1.0.0
 */
public class _162_寻找峰值 {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        return dfs(nums,0,nums.length - 1);
    }

    public int dfs(int[] nums, int l, int r) {
        if (l > r) return 0;
        int mid = l + (r - l) / 2;
        if (mid == nums.length - 1 && nums[mid - 1] < nums[mid]){
            return mid;
        }else if (mid == 0 && nums[mid + 1] < nums[mid]){
            return mid;
        }else if (mid > 0 && (nums[mid-1] < nums[mid] && nums[mid+1] < nums[mid])){
            return mid;
        }
        return Math.max(dfs(nums,l,mid-1),dfs(nums,mid+1,r));
    }
}
