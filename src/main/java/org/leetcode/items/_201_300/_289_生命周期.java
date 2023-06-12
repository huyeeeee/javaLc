package org.leetcode.items._201_300;

import java.util.Arrays;

/**
 * @Author: hujiangping
 * @Date: 2023/6/12 20:39
 * @Description: _289_生命周期
 * @Version 1.0.0
 */
public class _289_生命周期 {
    public static void main(String[] args) {
        int[][] ints = new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(ints);
        System.out.println(Arrays.deepToString(ints));
    }
    public static void gameOfLife(int[][] board) {
        int[][] tmp = new int[board.length][board[0].length];
        int m = board.length;
        int n = board[0].length;
        if (m == 1 && n == 1){
            board[0][0] = 0;
            return;
        }
        else if (m == 1){
            tmp[0][0] = 0;
            tmp[0][n-1] = 0;
            for (int i = 1; i < n - 1; i++) {
                tmp[0][i] = board[0][i-1] + board[0][i+1] == 2 ? 1 : 0;
            }
        }else if (n == 1){
            tmp[0][0] = 0;
            tmp[m-1][0] = 0;
            for (int i = 1; i < m - 1; i++) {
                tmp[i][0] = board[i-1][0] + board[i+1][0] == 2 ? 1 : 0;
            }
        }else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int count = 0;
                    if (i == 0 && j == 0){
                        count = board[i+1][j] + board[i][j+1] + board[i+1][j+1];
                    }else if (i == 0 && j == n - 1){
                        count = board[i+1][j] + board[i][j-1] + board[i+1][j-1];
                    }else if (i == m - 1 && j == 0){
                        count = board[i-1][j] + board[i][j+1] + board[i-1][j+1];
                    }else if (i == m - 1 && j == n - 1){
                        count = board[i-1][j] + board[i][j-1] + board[i-1][j-1];
                    }else if (i == 0){
                        count = board[i+1][j] + board[i][j+1] + board[i+1][j+1] + board[i][j-1] + board[i+1][j-1];;
                    }else if (i == m - 1){
                        count = board[i-1][j] + board[i][j+1] + board[i-1][j+1] + board[i][j-1] + board[i-1][j-1];;
                    }else if (j == 0){
                        count = board[i+1][j] + board[i][j+1] + board[i+1][j+1] + board[i-1][j] + board[i-1][j+1];
                    }else if (j == n - 1){
                        count = board[i+1][j] + board[i][j-1] + board[i+1][j-1] + board[i-1][j]  + board[i-1][j-1];
                    }else {
                        count = board[i+1][j] + board[i][j-1] + board[i+1][j-1] + board[i-1][j]  + board[i-1][j-1]
                                + board[i][j+1] + board[i+1][j+1] + board[i-1][j+1];
                    }
                    if(board[i][j] == 1){
                        if (count < 2 || count > 3) tmp[i][j] = 0;
                        else tmp[i][j] = 1;
                    }else {
                        if (count == 3) tmp[i][j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < tmp.length; i++) {
            System.arraycopy(tmp[i], 0, board[i], 0, tmp[0].length);
        }
    }
}
