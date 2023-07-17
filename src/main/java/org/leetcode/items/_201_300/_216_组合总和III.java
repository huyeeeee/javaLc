package org.leetcode.items._201_300;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Author: hujiangping
 * @Date: 2023/7/17 14:12
 * @Description: _216_组合总和III
 * @Version 1.0.0
 */
public class _216_组合总和III {
    int[] digits = {1,2,3,4,5,6,7,8,9};
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        dfs(res,path,0,k,n,0);
        return new ArrayList<>(res);
    }

    private void dfs(List<List<Integer>> res, Deque<Integer> path, int depth, int k, int n, int target) {
        if (path.size() == k){
            if (target == n){
                res.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = depth; i < digits.length; i++) {
            if (target > n) return;

            path.addLast(digits[i]);
            dfs(res,path,i+1,k,n,target+digits[i]);
            path.removeLast();
        }
    }
}
