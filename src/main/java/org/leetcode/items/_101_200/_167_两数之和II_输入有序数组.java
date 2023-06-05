package org.leetcode.items._101_200;

/**
 * @Author: hujiangping
 * @Date: 2023/6/5 23:49
 * @Description: _167_两数之和II_输入有序数组
 * @Version 1.0.0
 */
public class _167_两数之和II_输入有序数组 {
    public int[] twoSum(int[] n, int target) {
        int l = 0;
        int r = n.length - 1;
        while (n[r] + n[l] != target){
            if (n[r] + n[l] > target) r-=1;
            else l += 1;
        }
        return new int[]{l+1,r+1};
    }
}
