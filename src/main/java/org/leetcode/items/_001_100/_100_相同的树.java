package org.leetcode.items._001_100;

import org.leetcode.nodes.TreeNode;

/**
 * @Author: hujiangping
 * @Date: 2023/5/29 12:02
 * @Description: _100_相同的树
 * @Version 1.0.0
 */
public class _100_相同的树 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null || q == null) return false;
        else return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
