package org.leetcode.items._001_100;

import java.util.*;

/**
 * @Author: hujiangping
 * @Date: 2023/5/30 11:56
 * @Description: _40_组合总和II
 * @Version 1.0.0
 */
public class _40_组合总和II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int length = candidates.length;
        Set<List<Integer>> res = new HashSet<>();
        if (length == 0) return new ArrayList<>(res);
        boolean[] used = new boolean[length];
        Deque<Integer> path = new ArrayDeque<>();
        int sum = 0;
        for (int candidate : candidates) {
            sum += candidate;
        }
        if (sum < target) return new ArrayList<>(res);
        dfs(candidates, length, path, used, res, 0, target);
        return new ArrayList<>(res);
    }

    private void dfs(int[] candidates, int length, Deque<Integer> path, boolean[] used, Set<List<Integer>> res, int sum, int target) {
        if (sum > target) return;
        if (sum == target) {
            ArrayList<Integer> integers = new ArrayList<>(path);
            Collections.sort(integers);
            res.add(integers);
            return;
        }
        for (int i = 0; i < length; i++) {
            if (used[i]) {
                continue;
            }
            path.addLast(candidates[i]);
            used[i] = true;
            dfs(candidates, length, path, used, res, sum + candidates[i], target);
            used[i] = false;
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(new _40_组合总和II().combinationSum2(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 27));
    }
}
