package org.leetcode.items._001_100;

import java.util.*;

/**
 * @Author: hujiangping
 * @Date: 2023/5/30 11:46
 * @Description: _39_组合综合
 * @Version 1.0.0
 */
public class _39_组合总和 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int length = candidates.length;
        Set<List<Integer>> res = new HashSet<>();
        if (length == 0) return new ArrayList<>(res);

        Deque<Integer> subRes = new ArrayDeque<>();
        dfs(candidates,length,subRes,0,target,res);

        return new ArrayList<>(res);
    }

    private void dfs(int[] candidates, int length, Deque<Integer> subRes, int sum, int target, Set<List<Integer>> res) {
        if (sum > target) return;
        if (sum == target){
            ArrayList<Integer> integers = new ArrayList<>(subRes);

            Collections.sort(integers);
            res.add(integers);
            return;
        }

        for (int i = 0; i < length; i++) {
            subRes.addLast(candidates[i]);
            dfs(candidates,length,subRes,sum + candidates[i],target,res);
            subRes.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(new _39_组合总和().combinationSum(new int[]{2, 3, 6, 7}, 7));
    }
}
