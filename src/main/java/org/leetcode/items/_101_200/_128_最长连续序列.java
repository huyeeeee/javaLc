package org.leetcode.items._101_200;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hujiangping
 * @Date: 2023/5/25 20:57
 * @Description: _128_最长连续序列
 * @Version 1.0.0
 */
public class _128_最长连续序列 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int count = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)){
                int tmpCount = 0;
                while (set.contains(num)){
                    num ++;
                    tmpCount += 1;
                }
                count = Math.max(count,tmpCount);
            }
        }
        return count;
    }
}
