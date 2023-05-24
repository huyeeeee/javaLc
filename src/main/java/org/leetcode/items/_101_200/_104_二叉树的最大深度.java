package org.leetcode.items._101_200;

import org.leetcode.nodes.TreeNode;

/**
 * @Author: hujiangping
 * @Date: 2023/5/24 20:41
 * @Description: _104_二叉树的最大深度
 * @Version 1.0.0
 */
public class _104_二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
