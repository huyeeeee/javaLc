package org.leetcode.items._101_200;

import org.nodes.TreeNode;

/**
 * @Author: hujiangping
 * @Date: 2023/5/25 21:00
 * @Description: _113_路径总和II
 * @Version 1.0.0
 */
public class _112_路径总和 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return root.val == targetSum;
        return (hasPathSum(root.left,targetSum - root.val) || hasPathSum(root.right,targetSum - root.val));
    }

}
