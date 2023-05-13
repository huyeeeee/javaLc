package org.leetcode.items._1100_1200;

/**
 * @Author: hujiangping
 * @Date: 2023/5/3 17:03
 * @Description: _1137_第N个泰波那契数
 * @Version 1.0.0
 */
public class _1137_第N个泰波那契数 {
    public int tribonacci(int n) {
        if(n == 0 || n == 1) return n;
        if(n == 2) return 1;
        int f1 = 0;
        int f2 = 1;
        int f3 = 1;
        int f4 = 0;
        for(int i = 3;i<= n;i++){
            f4 = f1 + f2 + f3;
            f1 = f2;
            f2 = f3;
            f3 = f4;
        }
        return f4;
    }
}
