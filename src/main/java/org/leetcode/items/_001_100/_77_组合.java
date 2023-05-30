package org.leetcode.items._001_100;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Author: hujiangping
 * @Date: 2023/5/30 12:14
 * @Description: _77_组合
 * @Version 1.0.0
 */
public class _77_组合 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (n == 0 || k == 0) return res;
        boolean[] used = new boolean[n + 1];
        Deque<Integer> path = new ArrayDeque<>();
        dfs(n,0,used,k,path,0,res);
        return res;
    }

    private void dfs(int n,int count, boolean[] used, int k, Deque<Integer> path, int depth, List<List<Integer>> res) {
        if (depth > k) return;
        if (depth == k){
            res.add(new ArrayList<>(path));
        }

        for (int i = count; i < n; i++) {
            if (used[i+1]) continue;

            path.addLast(i+1);
            used[i+1] = true;
            dfs(n,i+1,used,k,path,depth+1,res);
            path.removeLast();
            used[i+1] = false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new _77_组合().combine(4, 2));
    }
}
