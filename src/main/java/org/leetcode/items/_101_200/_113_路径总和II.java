package org.leetcode.items._101_200;

import org.nodes.TreeNode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: hujiangping
 * @Date: 2023/5/25 21:00
 * @Description: _112_路径总和
 * @Version 1.0.0
 */
public class _113_路径总和II {
    List<List<Integer>> res = new LinkedList<>();
    ArrayDeque<Integer> queue = new ArrayDeque<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum);
        return res;
    }

    public void dfs(TreeNode root, int target){
        if (root == null) return;

        queue.offerLast(root.val);
        target -= root.val;
        if (root.left == null && root.right == null && target == 0){
            res.add(new LinkedList<>(queue));
        }
        dfs(root.left,target);
        dfs(root.right,target);
        queue.pollLast();
    }
}
