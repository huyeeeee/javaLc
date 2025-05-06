package org.leetcode.items._101_200;

import org.nodes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: hujiangping
 * @Date: 2023/5/2 20:23
 * @Description: _145_二叉树的后序遍历
 * @Version 1.0.0
 */
public class _145_二叉树的后序遍历 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> postorderTraversal1(TreeNode root) {
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root){
        if (root == null) return;
        dfs(root.left);
        dfs(root.right);
        res.add(root.val);
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        List<Integer> r = new ArrayList<>();
        if(root == null) return r;
        s.push(root);
        while (!s.isEmpty()){
            TreeNode peek = s.pop();
            TreeNode left = peek.left;
            TreeNode right = peek.right;
            peek.left = null;
            peek.right = null;
            if (left != null && right != null){
                s.push(peek);
                s.push(right);
                s.push(left);
            }else if (left != null){
                s.push(peek);
                s.push(left);
            }else if (right != null){
                s.push(peek);
                s.push(right);
            }else {
                r.add(peek.val);
            }
        }
        return r;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.right = t2;
        t2.left = t3;
        List<Integer> integers = postorderTraversal(t1);
        System.out.println(integers);
    }
}
