package org.leetcode.items._201_300;

import java.util.Arrays;

/**
 * @Author: hujiangping
 * @Date: 2023/6/8 23:42
 * @Description: _204_计数质数
 * @Version 1.0.0
 */
public class _204_计数质数 {
    public static int countPrimes(int n) {
        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim,true);
        for (int i = 2; i * i < n; i++) {
            if (isPrim[i]){
                for (int j = i*i; j < n; j+=i) {
                    isPrim[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            count += isPrim[i] ? 1 : 0;
        }
        return count;
    }
}
