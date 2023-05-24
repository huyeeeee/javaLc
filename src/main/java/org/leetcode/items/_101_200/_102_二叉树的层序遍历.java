package org.leetcode.items._101_200;

import org.leetcode.nodes.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: hujiangping
 * @Date: 2023/5/24 20:41
 * @Description: _102_二叉树的层序遍历
 * @Version 1.0.0
 */
public class _102_二叉树的层序遍历 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> q1 = new ArrayDeque<>();
        Queue<TreeNode> q2 = new ArrayDeque<>();
        q1.add(root);
        while (!q1.isEmpty() || !q2.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            if (!q1.isEmpty()){
                while (!q1.isEmpty()){
                    TreeNode poll = q1.poll();
                    if (poll.left != null) q2.add(poll.left);
                    if (poll.right != null) q2.add(poll.right);
                    temp.add(poll.val);
                }
            }else {
                while (!q2.isEmpty()){
                    TreeNode poll = q2.poll();
                    if (poll.left != null) q1.add(poll.left);
                    if (poll.right != null) q1.add(poll.right);
                    temp.add(poll.val);
                }
            }
            res.add(temp);
        }
        return res;
    }

}
