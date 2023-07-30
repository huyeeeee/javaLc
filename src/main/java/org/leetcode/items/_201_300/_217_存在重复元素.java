package org.leetcode.items._201_300;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hujiangping
 * @Date: 2023/7/17 21:42
 * @Description: _217_存在重复元素
 * @Version 1.0.0
 */
public class _217_存在重复元素 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}
