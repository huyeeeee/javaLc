package org.leetcode.nodes;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * @Author: hujiangping
 * @Date: 2023/4/21 20:04
 * @Description: NodeUtils
 * @Version 1.0.0
 */
public class NodeUtils {

    public static ListNode buildNode(List<Integer> values){
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        for (Integer value : values) {
            cur.next = new ListNode(value);
            cur = cur.next;
        }
        return head.next;
    }

    public static ListNode buildNode(int[] values){
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        for (int value : values) {
            cur.next = new ListNode(value);
            cur = cur.next;
        }
        return head.next;
    }

    public static TreeNode buildTreeNode(List<Integer> values){
        if (CollectionUtils.isEmpty(values)) return null;
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
