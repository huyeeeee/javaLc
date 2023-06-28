package org.leetcode.items._001_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hujiangping
 * @Date: 2023/6/28 23:30
 * @Description: _79_单词搜索
 * @Version 1.0.0
 */
public class _79_单词搜索 {
    boolean isGood = false;

    public boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[board.length][board[0].length];

        char c = word.charAt(0);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == c){
                    list.add(i + "_" + j);
                }
            }
        }
        if (word.length() == 1) return !list.isEmpty();
        for (String s : list) {
            int row = Integer.parseInt(s.split("_")[0]);
            int col = Integer.parseInt(s.split("_")[1]);
            if (!isGood){
                dfs(board,used,0,row,col,word);
            }else {
                break;
            }
        }
        return isGood;
    }

    private void dfs(char[][] board, boolean[][] used, int depth,int row,int col, String word) {
        if (depth == word.length()){
            isGood = true;
            return;
        }
        if (used[row][col]) return;
        if (word.charAt(depth) != board[row][col]) return;
        used[row][col] = true;
        if (row > 0){
            dfs(board,used,depth + 1,row-1,col,word);
        }
        if (row < board.length - 1){
            dfs(board,used,depth + 1,row+1,col,word);
        }
        if (col > 0){
            dfs(board,used,depth + 1,row,col-1,word);
        }
        if (col < board[0].length - 1){
            dfs(board,used,depth + 1,row,col+1,word);
        }
        used[row][col] = false;
    }
}
