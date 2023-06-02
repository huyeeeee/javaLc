package org.leetcode.items._001_100;

import java.util.*;

/**
 * @Author: hujiangping
 * @Date: 2023/6/2 09:24
 * @Description: _90_子集
 * @Version 1.0.0
 */
public class _90_子集 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> res = new HashSet<>();
        int length = nums.length;
        if (length == 0) return new ArrayList<>(res);

        Deque<Integer> path = new ArrayDeque<>();
        boolean[] used = new boolean[length];
        dfs(nums,length,0,used,path,res);
        return new ArrayList<>(res);
    }

    private void dfs(int[] nums, int length, int depth, boolean[] used, Deque<Integer> path, HashSet<List<Integer>> res) {
        ArrayList<Integer> integers = new ArrayList<>(path);
        Collections.sort(integers);
        res.add(integers);
        for (int i = depth; i < length; i++) {
            if (used[i]) continue;

            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums,length,depth + 1,used,path,res);
            used[i] = false;
            path.removeLast();
        }
    }
}
