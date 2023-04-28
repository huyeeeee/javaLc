package org.leetcode.items._101_200;

/**
 * @Auther: hujiangping
 * @Date: 2023/4/28 12:41
 * @Description: _136_只出现一次的数字
 * @Version 1.0.0
 */
public class _136_只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int n = 0;
        for(int s : nums){
            n = n ^ s;
        }
        return n;
    }
}
