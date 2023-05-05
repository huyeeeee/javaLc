package org.leetcode.items._001_100;

/**
 * @Auther: hujiangping
 * @Date: 2023/5/4 15:26
 * @Description: _59_螺旋矩阵II
 * @Version 1.0.0
 */
public class _59_螺旋矩阵II {
    public int[][] generateMatrix(int n) {
        int[][] r = new int[n][n];
        int up = 0,down = n-1,left = 0,right = n-1;
        int c = 1;
        int count = n*n;
        while(c <= count){
            // 从左往右
            for(int i = left;i <= right;i++){
                r[up][i] = c ++;
            }
            up ++;
            for(int i = up;i <= down;i++){
                r[i][right] = c++;
            }
            right --;
            for(int i = right;i >= left;i--){
                r[down][i] = c++;
            }
            down --;
            for(int i = down;i >= up;i--){
                r[i][left] = c++;
            }
            left ++;
        }
        return r;
    }
}
