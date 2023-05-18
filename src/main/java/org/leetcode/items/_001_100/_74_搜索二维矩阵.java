package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/5/18 20:40
 * @Description: _74_搜索二维矩阵
 * @Version 1.0.0
 */
public class _74_搜索二维矩阵 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int up = 0;
        int down = m - 1;
        while (up < down){
            int mid = up + (down - up) / 2;
            if (matrix[mid][n-1] == target) return true;
            else if (matrix[mid][n - 1] < target) up = mid + 1;
            else{
                if (matrix[mid][0] == target) return true;
                else if (matrix[mid][0] < target) {
                    up = mid;
                    break;
                }
                down = mid - 1;
            }
        }
        int row = up;
        int left = 0;
        int right = n - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (matrix[row][mid] == target) return true;
            else if (matrix[row][mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return matrix[row][left] == target;
    }
}
