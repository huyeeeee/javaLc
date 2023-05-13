package org.leetcode.items._101_200;

/**
 * @Author: hujiangping
 * @Date: 2023/5/3 16:01
 * @Description: _121_买股票的最佳时机
 * @Version 1.0.0
 */
public class _121_买股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]){
                min = prices[i];
            }else {
                max = Math.max(max,prices[i]-min);
            }
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(new _121_买股票的最佳时机().maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
