package org.leetcode.items._201_300;

/**
 * @Auther: hujiangping
 * @Date: 2023/4/28 11:49
 * @Description: _258_各位相加
 * @Version 1.0.0
 */
public class _258_各位相加 {
    public int addDigits(int n) {
        return (n - 1) % 9 + 1;
    }
}
