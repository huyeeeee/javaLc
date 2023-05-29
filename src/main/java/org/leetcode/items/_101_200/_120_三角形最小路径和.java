package org.leetcode.items._101_200;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hujiangping
 * @Date: 2023/5/29 11:22
 * @Description: _120_三角形最小路劲和
 * @Version 1.0.0
 */
public class _120_三角形最小路径和 {
    public static int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> t1 = new ArrayList<>();
        for (int i = 0; i < triangle.size(); i++) {
            List<Integer> list = triangle.get(i);
            for (int j = list.size() - 1; j >= 0; j--) {
                if (j == 0) {
                    if (t1.isEmpty()) t1.add(list.get(j));
                    else t1.set(j, t1.get(j) + list.get(j));
                } else if (j == i) t1.add(t1.get(j - 1) + list.get(j));
                else {
                    t1.set(j, Math.min(t1.get(j - 1), t1.get(j)) + list.get(j));
                }
            }
        }
        int min = t1.get(0);
        for (Integer integer : t1) {
            min = Math.min(min, integer);
        }
        return min;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> r1 = Lists.newArrayList(2);
        List<Integer> r2 = Lists.newArrayList(3, 4);
        List<Integer> r3 = Lists.newArrayList(6, 5, 7);
        List<Integer> r4 = Lists.newArrayList(4, 1, 8, 3);
        triangle.add(r1);
        triangle.add(r2);
        triangle.add(r3);
        triangle.add(r4);
        System.out.println(minimumTotal(triangle));
    }
}
