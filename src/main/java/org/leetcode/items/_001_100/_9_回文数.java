package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/6/28 23:31
 * @Description: _9_回文数
 * @Version 1.0.0
 */
public class _9_回文数{
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        int y = x;
        long res = 0;
        while (y > 0){
            int i1 = y % 10;
            y /= 10;
            res *= 10;
            res += i1;
        }
        return x == res;

    }

}
