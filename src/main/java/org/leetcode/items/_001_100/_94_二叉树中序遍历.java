package org.leetcode.items._001_100;

import org.leetcode.nodes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Auther: hujiangping
 * @Date: 2023/4/21 21:18
 * @Description: _94_二叉树中序遍历
 * @Version 1.0.0
 */
public class _94_二叉树中序遍历 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal1(TreeNode root) {
        if (root == null) return list;
        inorderTraversal1(root.left);
        list.add(root.val);
        inorderTraversal1(root.right);
        return list;
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }else{
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
        return list;
    }
}
