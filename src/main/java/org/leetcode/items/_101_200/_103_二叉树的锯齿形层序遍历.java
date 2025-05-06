package org.leetcode.items._101_200;

import org.nodes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: hujiangping
 * @Date: 2023/5/24 20:41
 * @Description: _103_二叉树的锯齿形层序遍历
 * @Version 1.0.0
 */
public class _103_二叉树的锯齿形层序遍历 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> q1 = new Stack<>();
        Stack<TreeNode> q2 = new Stack<>();
        q1.push(root);
        while (!q1.isEmpty() || !q2.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            if (!q1.isEmpty()){
                while (!q1.isEmpty()){
                    TreeNode poll = q1.pop();
                    if (poll.left != null) q2.push(poll.left);
                    if (poll.right != null) q2.push(poll.right);
                    temp.add(poll.val);
                }
            }else {
                while (!q2.isEmpty()){

                    TreeNode poll = q2.pop();
                    if (poll.right != null) q1.push(poll.right);
                    if (poll.left != null) q1.push(poll.left);
                    temp.add(poll.val);
                }
            }
            res.add(temp);
        }
        return res;
    }
}
