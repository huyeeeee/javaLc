package org.leetcode.items._101_200;

import org.nodes.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hujiangping
 * @Date: 2023/5/24 20:41
 * @Description: _105_从前序与中序遍历序列构造二叉树
 * @Version 1.0.0
 */
public class _105_从前序与中序遍历序列构造二叉树 {
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return buildTree(preorder,0,preorder.length - 1,inorder,0,inorder.length - 1);

    }
    public TreeNode buildTree(int[] preorder, int preLeft, int preRight, int[] inorder, int inorderLeft, int inorderRight){
        if (preLeft > preRight) return null;
        int inRoot = map.get(preorder[preLeft]);
        TreeNode t = new TreeNode(preorder[preLeft]);
        int size = inRoot - inorderLeft;
        t.left = buildTree(preorder,preLeft + 1,preLeft + size,inorder,inorderLeft,inRoot - 1);
        t.right = buildTree(preorder,preLeft + size + 1,preRight,inorder,inRoot + 1,inorderRight);
        return t;
    }
}
