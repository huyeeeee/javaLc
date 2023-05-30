package org.leetcode.items._001_100;

import java.util.*;

/**
 * @Author: hujiangping
 * @Date: 2023/5/30 12:26
 * @Description: _78_子集
 * @Version 1.0.0
 */
public class _78_子集 {
    public List<List<Integer>> subsets(int[] nums) {
        int length = nums.length;
        Set<List<Integer>> res = new HashSet<>();
        if (length == 0) return new ArrayList<>(res);


        boolean[] used = new boolean[length];
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums, 0, path, res, used);
        return new ArrayList<>(res);
    }

    private void dfs(int[] nums, int count, Deque<Integer> path, Set<List<Integer>> res, boolean[] used) {
        ArrayList<Integer> integers = new ArrayList<>(path);
        Collections.sort(integers);
        res.add(integers);
        for (int i = count; i < nums.length; i++) {
            if (used[i]) continue;
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums, count + 1, path, res, used);
            used[i] = false;
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(new _78_子集().subsets(new int[]{1, 2, 3}));
    }
}
