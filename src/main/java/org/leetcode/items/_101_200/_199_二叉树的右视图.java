package org.leetcode.items._101_200;

import org.leetcode.nodes.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Auther: hujiangping
 * @Date: 2023/5/10 21:53
 * @Description: _199_二叉树的右视图
 * @Version 1.0.0
 */
public class _199_二叉树的右视图 {
    public List<Integer> rightSideView(TreeNode r) {
        List<Integer> list = new ArrayList<>();
        if (r == null) return list;
        Queue<TreeNode> q1 = new ArrayDeque<>();
        Queue<TreeNode> q2 = new ArrayDeque<>();
        q1.add(r);
        while (q1.size() != 0 || q2.size() != 0){
            if (q1.size() != 0){
                while (!q1.isEmpty()){
                    TreeNode t = q1.poll();
                    if (q1.size() == 0) list.add(t.val);
                    if (t.left != null) q2.add(t.left);
                    if (t.right != null) q2.add(t.right);
                }
            }else {
                while (!q2.isEmpty()){
                    TreeNode t = q2.poll();
                    if (q2.size() == 0) list.add(t.val);
                    if (t.left != null) q1.add(t.left);
                    if (t.right != null) q1.add(t.right);
                }
            }
        }
        return list;
    }
}
