package org.leetcode.items._001_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hujiangping
 * @Date: 2023/5/4 15:27
 * @Description: _54_螺旋矩阵
 * @Version 1.0.0
 */
public class _54_螺旋矩阵 {
    public List<Integer> spiralOrder(int[][] r) {
        int n = r.length;
        int m = r[0].length;
        int up = 0,down = n-1,left = 0,right = m-1;
        List<Integer> res = new ArrayList<>();
        int num = n * m;
        while(res.size() <= num){
            // 从左往右
            for(int i = left;i <= right;i++){
                res.add(r[up][i]);
            }
            up ++;
            if (res.size() == num) break;
            for(int i = up;i <= down;i++){
                res.add(r[i][right]);
            }
            right --;
            if (res.size() == num) break;
            for(int i = right;i >= left;i--){
                res.add(r[down][i]);
            }
            down --;
            if (res.size() == num) break;
            for(int i = down;i >= up;i--){
                res.add(r[i][left]);
            }
            left ++;
            if (res.size() == num) break;
        }
        return res;
    }
}
