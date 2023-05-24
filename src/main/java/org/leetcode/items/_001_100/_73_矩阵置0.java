package org.leetcode.items._001_100;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hujiangping
 * @Date: 2023/5/19 20:33
 * @Description: _73_矩阵置0
 * @Version 1.0.0
 */
public class _73_矩阵置0 {
    public void setZeroes(int[][] m) {
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == 0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        for (Integer integer : rowSet) {
            for (int i = 0; i < m[0].length; i++) {
                m[integer][i] = 0;
            }
        }
        for (Integer integer : colSet) {
            for (int i = 0; i < m.length; i++) {
                m[i][integer] = 0;
            }
        }
    }
}
