package org.leetcode.items._101_200;

import org.leetcode.nodes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: hujiangping
 * @Date: 2023/4/21 21:21
 * @Description: _144_二叉树前序遍历
 * @Version 1.0.0
 */
public class _144_二叉树前序遍历 {

    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> queue = new Stack<>();
        TreeNode cur = root;
        while (cur != null || queue.size() != 0){
            if (cur != null){
                list.add(cur.val);
                queue.push(cur);
                cur = cur.left;
            }else {
                cur = queue.pop();
                cur = cur.right;
            }
        }
        return list;
    }
}
