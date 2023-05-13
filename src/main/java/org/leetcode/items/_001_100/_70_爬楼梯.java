package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/5/3 16:57
 * @Description: _70_爬楼梯
 * @Version 1.0.0
 */
public class _70_爬楼梯 {
    public int climbStairs(int n) {
        if(n == 1 || n == 2) return n;
        int f1 = 1;
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
