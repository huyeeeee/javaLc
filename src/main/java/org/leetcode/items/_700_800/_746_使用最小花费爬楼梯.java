package org.leetcode.items._700_800;

/**
 * @Auther: hujiangping
 * @Date: 2023/5/3 17:09
 * @Description: _700_800
 * @Version 1.0.0
 */
public class _746_使用最小花费爬楼梯 {
    public int minCostClimbingStairs(int[] c) {
        if(c.length == 1) return c[0];
        else if (c.length == 2) return Math.min(c[0],c[1]);
        int[] dp = new int[c.length];
        for(int i = 0;i < c.length;i++){
            if(i == 0 || i == 1){
                dp[i] = c[i];
            }else{
                dp[i] = Math.min(dp[i-1],dp[i-2]) + c[i];
            }
        }
        return Math.min(dp[c.length - 1],dp[c.length - 2]);
    }

    public static void main(String[] args) {
        System.out.println(new _746_使用最小花费爬楼梯().minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
