package org.leetcode.items._101_200;

/**
 * @Author: hujiangping
 * @Date: 2023/6/5 23:53
 * @Description: _172_阶乘后的零
 * @Version 1.0.0
 */
public class _172_阶乘后的零 {
    public int trailingZeroes(int n) {
        int count = 0;
        for (int i = 5; i <= n; i+=5) {
            int t = i;
            while (t % 10 == 0){
                count += 1;
                t = t / 10;
            }
            while (t % 5 == 0){
                count += 1;
                t = t / 5;
            }
        }
        return count;
    }
}
