package org.leetcode.items._001_100;

import org.nodes.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: hujiangping
 * @Date: 2023/5/29 12:06
 * @Description: _99_恢复二叉搜索树
 * @Version 1.0.0
 */
public class _99_恢复二叉搜索树 {
    public void recoverTree(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode x = null,y = null,pre = null;
        while (!stack.isEmpty() || root != null){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pre != null && root.val < pre.val){
                y = root;
                if (x == null) x = pre;
                else break;
            }
            pre = root;
            root = root.right;
        }

        int tmp = x.val;
        x.val = y.val;
        y.val = tmp;
    }
}
