package org.leetcode.items._101_200;

import org.leetcode.nodes.TreeNode;

/**
 * @Author: hujiangping
 * @Date: 2023/5/25 20:58
 * @Description: _110_平衡二叉树
 * @Version 1.0.0
 */
public class _110_平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int getHeight(TreeNode root){
        if (root == null) return 0;
        return Math.max(getHeight(root.left),getHeight(root.right)) + 1;
    }
}
