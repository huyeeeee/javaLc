package org.leetcode.items._501_600;

/**
 * @Author: hujiangping
 * @Date: 2023/5/3 16:59
 * @Description: _509_斐波那契数
 * @Version 1.0.0
 */
public class _509_斐波那契数 {

    public int fib1(int n) {
        if(n == 0|| n == 1) return n;
        return fib1(n-1) + fib1(n-2);
    }
    public int fib(int n) {
        if(n == 0 || n == 1) return n;
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;
        for(int i = 2;i<= n;i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
