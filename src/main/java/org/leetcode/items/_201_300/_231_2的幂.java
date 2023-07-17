package org.leetcode.items._201_300;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hujiangping
 * @Date: 2023/7/17 14:08
 * @Description: _231_2的幂
 * @Version 1.0.0
 */
public class _231_2的幂 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}
