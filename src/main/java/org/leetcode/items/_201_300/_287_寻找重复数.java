package org.leetcode.items._201_300;

/**
 * @Auther: hujiangping
 * @Date: 2023/4/28 12:33
 * @Description: _287_寻找重复数
 * @Version 1.0.0
 */
public class _287_寻找重复数 {
    public int findDuplicate(int[] nums) {
        int s = 0;
        int f = 0;
        s = nums[s];
        f = nums[nums[f]];
        while(s != f){
            s = nums[s];
            f = nums[nums[f]];
        }
        int p1 = 0;
        int p2 = s;
        while(p1 != p2){
            p1 = nums[p1];
            p2 = nums[p2];
        }
        return p1;
    }
}
