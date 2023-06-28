package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/6/28 23:31
 * @Description: _50_Pow
 * @Version 1.0.0
 */
public class _50_Pow {
    public double myPow(double x, int n) {
        int abs = Math.abs(n);
        String bit = Integer.toBinaryString(abs);
        double res = 1d;
        double count = x;
        for (int i = bit.length() - 1; i >= 0; i--) {
            if ('1' == bit.charAt(i)){
                res *= count;
            }
            count *= count;
        }
        return n < 0 ? 1/res : res;
    }

}
