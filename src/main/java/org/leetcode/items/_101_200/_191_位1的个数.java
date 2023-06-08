package org.leetcode.items._101_200;

/**
 * @Author: hujiangping
 * @Date: 2023/6/8 23:38
 * @Description: _191_位1的个数
 * @Version 1.0.0
 */
public class _191_位1的个数 {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                count += 1;
            }
        }
        return count;
    }
}
