package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/5/14 10:53
 * @Description: _33_搜索旋转排序数组
 * @Version 1.0.0
 */
public class _33_搜索旋转排序数组 {

    public static int search(int[] nums, int target) {
        int l = nums.length;
        if (l == 0) return -1;
        if (l == 1) return nums[0] == target ? 0 : -1;

        int s = 0;
        int e = l - 1;

        while (s <= e){
            int m = e - (e - s) / 2;
            if (nums[m] == target) return target;
            if (nums[0] < nums[m]){
                if (nums[0] <= target && target < nums[m]){
                    e = m - 1;
                }else {
                    s = m + 1;
                }
            }else {
                if (nums[m] < target && target <= nums[l-1]){
                    s = m + 1;
                }else {
                    e = m - 1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] n = {1};
        System.out.println(search(n, 1));
    }

}
