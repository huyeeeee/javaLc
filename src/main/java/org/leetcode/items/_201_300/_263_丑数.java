package org.leetcode.items._201_300;

/**
 * @Author: hujiangping
 * @Date: 2023/6/15 23:50
 * @Description: _263_丑数
 * @Version 1.0.0
 */
public class _263_丑数 {
    public boolean isUgly(int n) {
        if (n == 0) return false;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 3 == 0) {
                n /= 3;
            }else if (n % 5 == 0){
                n /= 5;
            }else {
                return false;
            }
        }
        return true;
    }
}
