package org.leetcode.items._001_100;

import java.util.*;

/**
 * @Author: hujiangping
 * @Date: 2023/5/30 11:24
 * @Description: _46_全排列
 * @Version 1.0.0
 */
public class _46_全排列 {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        int length = nums.length;
        if (length == 0) return res;
        Deque<Integer> path = new ArrayDeque<>();

        boolean[] used = new boolean[length];
        dfs(nums, length, 0, path, used, res);
        return res;
    }

    /**
     * 回溯需要三个状态值
     * 1.当前递归的深度
     * 2.当前值是否使用了
     * 3.已经选了哪些数字
     * @param nums
     * @param len
     * @param depth
     * @param path
     * @param used
     * @param res
     */
    private void dfs(int[] nums, int len, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (len == depth) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (used[i]) continue;

            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums,len,depth+1,path,used,res);
            path.removeLast();
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new _46_全排列().permute(new int[]{1, 2, 3}));
    }
}
