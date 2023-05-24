package org.leetcode.items._101_200;

import org.leetcode.nodes.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hujiangping
 * @Date: 2023/5/24 20:42
 * @Description: _106_从中序与后序遍历序列构造二叉树
 * @Version 1.0.0
 */
public class _106_从中序与后序遍历序列构造二叉树 {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildSubTree(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    public TreeNode buildSubTree(int[] inorder, int[] postorder, int inL, int inR, int postL, int postR) {
        if (postL > postR) return null;
        TreeNode t = new TreeNode(postorder[postR]);

        int inRoot = map.get(postorder[postR]);
        int size = inRoot - inL;
        t.left = buildSubTree(inorder, postorder, inL, inRoot - 1, postL, postL + size - 1);
        t.right = buildSubTree(inorder, postorder, inRoot + 1, inR, postL + size, postR - 1);
        return t;
    }
}
