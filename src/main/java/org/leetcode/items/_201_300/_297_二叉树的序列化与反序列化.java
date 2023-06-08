package org.leetcode.items._201_300;

import org.leetcode.nodes.TreeNode;

import java.util.*;

/**
 * @Author: hujiangping
 * @Date: 2023/6/8 23:44
 * @Description: _297_二叉树的序列化与反序列化
 * @Version 1.0.0
 */
public class _297_二叉树的序列化与反序列化 {
    public final TreeNode D_NODE = new TreeNode(-1001);
    public String serialize(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list.toString();
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        while (!deque.isEmpty()){
            TreeNode remove = deque.remove();
            if (remove.val == -1001){
                list.add(null);
            }else {
                list.add(remove.val);
                deque.add(remove.left == null ? D_NODE : remove.left);
                deque.add(remove.right == null ? D_NODE : remove.right);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == null) list.remove(i);
            else break;
        }
        return list.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if ("[]".equals(data)) return null;
        String[] split = data.replace("[", "").replace("]", "").split(",");
        if (split.length == 0)return null;
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            if("null".equals(split[i].trim())){
                values.add(null);
            }else {
                values.add(Integer.parseInt(split[i].trim()));
            }
        }

        if (values.size() == 0) return null;
        TreeNode root = new TreeNode(values.get(0));
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int count = 1;
        Integer integer;
        while (!q.isEmpty()){
            TreeNode poll = q.poll();
            if (count >= values.size()) return root;
            integer = values.get(count++);
            if (integer != null) {
                poll.left = new TreeNode(integer);
                q.add(poll.left);
            }
            if (count >= values.size()) return root;
            integer = values.get(count++);
            if (integer != null){
                poll.right = new TreeNode(integer);
                q.add(poll.right);
            }
        }
        return root;
    }
}