package org.leetcode.items._201_300;

import org.nodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hujiangping
 * @Date: 2023/6/26 21:44
 * @Description: _230_二叉搜索树中第K小的元素
 * @Version 1.0.0
 */
public class _230_二叉搜索树中第K小的元素 {
    List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return list.get(k-1);
    }

    public void dfs(TreeNode root,int k){
        if (root == null) return;
        dfs(root.left,k);
        list.add(root.val);
        dfs(root.right,k);
    }
}
