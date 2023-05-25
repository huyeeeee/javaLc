package org.leetcode.items._101_200;

import org.leetcode.nodes.TreeNode;

/**
 * @Author: hujiangping
 * @Date: 2023/5/25 20:58
 * @Description: _111_二叉树的最小深度
 * @Version 1.0.0
 */
public class _111_二叉树的最小深度 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int l1 = minDepth(root.left);
        int l2 = minDepth(root.right);
        if (root.left == null || root.right == null) return l1 + l2 + 1;
        return Math.min(l1,l2) + 1;
    }
}
