package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/5/30 10:15
 * @Description: _11_盛水最多的容器
 * @Version 1.0.0
 */
public class _11_盛水最多的容器 {
    public static int maxArea(int[] height) {
        int l = 0,r = height.length - 1;
        int maxArea = 0;
        while (l < r){
            maxArea = Math.max(Math.min(height[l],height[r]) * (r - l),maxArea);
            if (height[l] > height[r]){
                r--;
            }else {
                l++;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,1}));
    }
}
