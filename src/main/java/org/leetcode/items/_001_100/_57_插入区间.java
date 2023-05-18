package org.leetcode.items._001_100;

import java.util.Arrays;

/**
 * @Author: hujiangping
 * @Date: 2023/5/15 20:20
 * @Description: _57_插入区间
 * @Version 1.0.0
 */
public class _57_插入区间 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] tmp = new int[intervals.length + 1][2];
        if (intervals.length == 0){
            tmp[0] = newInterval;
            return tmp;
        }
        if (newInterval == null) return intervals;

        int pre = -1;
        int cur = 0;
        boolean isDone = false;
        int count = 0;
        for (int i = 0; i < intervals.length; i++) {
            cur = intervals[i][0];
            if (newInterval[0] > pre && cur >= newInterval[0] && !isDone){
                tmp[count++] = newInterval;
                isDone = true;
            }
            tmp[count++] = intervals[i];
            pre = intervals[i][0];
        }

        if (!isDone){
            tmp[count] = newInterval;
        }
        int[][] res = new int[intervals.length + 1][2];
        int idx = -1;
        for (int[] ints : tmp) {
            if (idx == -1 || ints[0] > res[idx][1]){
                res[++idx] = ints;
            }else {
                res[idx][1] = Math.max(res[idx][1],ints[1]);
            }
        }
        return Arrays.copyOf(res,idx + 1);
    }
}
