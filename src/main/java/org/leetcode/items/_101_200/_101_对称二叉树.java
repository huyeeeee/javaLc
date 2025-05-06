package org.leetcode.items._101_200;

import org.nodes.TreeNode;

/**
 * @Author: hujiangping
 * @Date: 2023/5/24 20:40
 * @Description: _101_对称二叉树
 * @Version 1.0.0
 */
public class _101_对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left,root.right);
    }
    public boolean compare(TreeNode t1,TreeNode t2){
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        if (t1.val != t2.val) return false;
        boolean b1 = compare(t1.left,t2.right);
        boolean b2 = compare(t1.right,t2.left);
        return b1 && b2;
    }
}
