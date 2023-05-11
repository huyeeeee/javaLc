package org.leetcode.items._001_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: hujiangping
 * @Date: 2023/5/11 20:59
 * @Description: _15_三数之和
 * @Version 1.0.0
 */
public class _15_三数之和 {
    public List<List<Integer>> threeSum(int[] n) {
        List<List<Integer>> lists = new ArrayList<>();
        if (n.length < 3) return lists;
        Arrays.sort(n);
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0) return lists;
            int mid = i + 1;
            int end = n.length - 1;
            if (i > 0 && n[i] == n[i - 1]) continue;
            while (mid < end){
                int val = n[i] + n[mid] + n[end];
                if (val == 0){
                    List<Integer> l = new ArrayList<>();
                    l.add(n[i]);
                    l.add(n[mid]);
                    l.add(n[end]);
                    lists.add(l);

                    while (mid < end && n[mid] == n[mid+1]) mid+=1;
                    while (mid < end && n[end] == n[end - 1]) end -= 1;

                    mid += 1;
                    end -= 1;
                }else if (val < 0) mid += 1;
                else end -= 1;
            }
        }
        return lists;
    }
}
