package org.leetcode.items._101_200;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hujiangping
 * @Date: 2023/5/29 11:03
 * @Description: _118_杨辉三角
 * @Version 1.0.0
 */
public class _118_杨辉三角 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i < numRows;i++){
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i){
                    tmp.add(1);
                }else {
                    tmp.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(tmp);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(generate(1));
    }
}
