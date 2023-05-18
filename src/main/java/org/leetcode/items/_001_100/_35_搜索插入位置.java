package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/5/14 19:41
 * @Description: _35_搜索插入位置
 * @Version 1.0.0
 */
public class _35_搜索插入位置 {
    public static int searchInsert(int[] nums, int target) {
        int l = nums.length;
        int s = 0;
        int e = l - 1;
        int t = l;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] < target) {
                s = m + 1;
            } else {
                e = m - 1;
                t = m;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(searchInsert(nums, 5));
//        System.out.println(searchInsert(nums, 3));
//        System.out.println(searchInsert(nums, 7));
    }
}
