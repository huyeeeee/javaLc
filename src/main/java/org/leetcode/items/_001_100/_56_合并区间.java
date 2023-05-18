package org.leetcode.items._001_100;

import java.util.Arrays;

/**
 * @Author: hujiangping
 * @Date: 2023/5/15 20:19
 * @Description: _56_合并区间
 * @Version 1.0.0
 */
public class _56_合并区间 {
    public int[][] merge(int[][] intervals) {
        int[][] res = new int[intervals.length][2];
        int length = -1;
        if (intervals.length == 1) return intervals;
        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
        for (int[] interval : intervals) {
            if (length == -1 || interval[0] > res[length][1]){
                res[++length] = interval;
            }else {
                res[length][1] = Math.max(res[length][1],interval[1]);
            }
        }
        return Arrays.copyOf(res,length+1);
    }
}
