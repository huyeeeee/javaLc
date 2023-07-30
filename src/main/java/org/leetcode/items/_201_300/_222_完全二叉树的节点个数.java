package org.leetcode.items._201_300;

import org.leetcode.nodes.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class _222_完全二叉树的节点个数 {
    public int countNodes(TreeNode root) {
        int count = 0;
        Deque<TreeNode> queue = new ArrayDeque<>();
        if (root == null) return count;
        queue.addLast(root);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.pollFirst();
            count+=1;
            if (treeNode.left != null) queue.addLast(treeNode.left);
            if (treeNode.right != null) queue.addLast(treeNode.right);
        }
        return count;
    }
}
