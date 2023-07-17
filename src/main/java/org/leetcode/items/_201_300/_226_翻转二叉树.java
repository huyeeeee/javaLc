package org.leetcode.items._201_300;

import org.leetcode.nodes.TreeNode;

/**
 * @Author: hujiangping
 * @Date: 2023/7/17 14:11
 * @Description: _226_翻转二叉树
 * @Version 1.0.0
 */
public class _226_翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }
    public void swap(TreeNode root){
        if (root == null) return;
        if (root.left == null && root.right == null) return;
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        swap(root.left);
        swap(root.right);

    }
}
