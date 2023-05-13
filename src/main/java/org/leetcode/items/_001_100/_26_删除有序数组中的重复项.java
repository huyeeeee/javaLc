package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/5/13 15:12
 * @Description: _26_删除有序数组中的重复项
 * @Version 1.0.0
 */
public class _26_删除有序数组中的重复项 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int count = 0;
        for (int i = 1; i < nums.length;i++) {
            if (nums[count] != nums[i]) {
                count += 1;
                nums[count] = nums[i];
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        int[] n = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(n));
    }
}
