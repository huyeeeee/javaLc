package org.leetcode.items._001_100;

import java.util.Arrays;

/**
 * @Author: hujiangping
 * @Date: 2023/5/18 20:42
 * @Description: _34_在排序数组中查找元素的第一个和最后一个位置
 * @Version 1.0.0
 */
public class _34_在排序数组中查找元素的第一个和最后一个位置 {


    public static void main(String[] args) {
        int[] nums = new int[]{7,8};
        System.out.println(Arrays.toString(searchRange(nums, 7)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int index1 = -1;
        int index2 = -1;
        int l = 0;
        int r = nums.length-1;
        while (l <= r){
            int mid = l + (r - l) / 2;
            if (nums[mid] > target) r = mid - 1;
            else if (nums[mid] < target) l = mid + 1;
            else {
                index1 = mid;
                index2 = mid;
                while (index1-1 >= 0 && nums[index1 - 1] == target){
                    index1 -= 1;
                }
                while (index2+1 <= nums.length - 1 && nums[index2 + 1] == target){
                    index2 += 1;
                }
                break;
            }
        }
        return new int[]{index1,index2};
    }
}
