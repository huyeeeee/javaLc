package org.leetcode.items._101_200;

/**
 * @Author: hujiangping
 * @Date: 2023/5/29 16:15
 * @Description: _137_只出现一次的数字II
 * @Version 1.0.0
 */
public class _137_只出现一次的数字II {
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int total = 0;
            for (int num : nums) {
                total += ((num >> i) & 1);
            }
            if (total % 3 != 0){
                res |= (1 << i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {11,1,11,11,2,2,2,22,22,22};
        System.out.println(singleNumber(nums));
    }
}
