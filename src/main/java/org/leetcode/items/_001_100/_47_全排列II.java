package org.leetcode.items._001_100;

import java.util.*;

/**
 * @Author: hujiangping
 * @Date: 2023/5/30 11:39
 * @Description: _47_全排列II
 * @Version 1.0.0
 */
public class _47_全排列II {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int length = nums.length;
        Set<List<Integer>> res = new HashSet<>();
        if (length == 0) return new ArrayList<>(res);
        Deque<Integer> path = new ArrayDeque<>();
        boolean[] used = new boolean[length];
        dfs(nums, length, 0, path, used, res);
        return new ArrayList<>(res);
    }

    private void dfs(int[] nums, int length, int depth, Deque<Integer> path, boolean[] used, Set<List<Integer>> res) {
        if (length == depth) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (used[i]) continue;

            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums, length, depth + 1, path, used, res);
            path.removeLast();
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new _47_全排列II().permuteUnique(new int[]{1, 2, 3}));
    }
}
