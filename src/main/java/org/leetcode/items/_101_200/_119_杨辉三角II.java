package org.leetcode.items._101_200;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hujiangping
 * @Date: 2023/5/29 11:07
 * @Description: _119_杨辉三角II
 * @Version 1.0.0
 */
public class _119_杨辉三角II {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            tmp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) tmp.add(1);
                else {
                    tmp.add(res.get(j) + res.get(j-1));
                }
            }
            res = tmp;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
