package org.leetcode.items._101_200;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Auther: hujiangping
 * @Date: 2023/5/2 15:08
 * @Description: _117_填充每个节点的下一个右侧节点指针II
 * @Version 1.0.0
 */
public class _117_填充每个节点的下一个右侧节点指针II {
    public Node connect(Node root) {
        if(root == null) return root;
        Queue<Node> q1 = new ArrayDeque<>();
        Queue<Node> q2 = new ArrayDeque<>();
        q1.add(root);
        while (q1.size() != 0 || q2.size() != 0) {

            Node pre = null;
            Node cur = null;
            if (q1.size() != 0) {
                while (q1.size() != 0) {

                    Node tmp = q1.poll();
                    if (tmp.left != null) q2.add(tmp.left);
                    if (tmp.right != null) q2.add(tmp.right);
                    pre = cur;
                    cur = tmp;
                    if (pre != null && cur != null) {
                        pre.next = cur;
                    }
                }
            } else {
                while (q2.size() != 0) {

                    Node tmp = q2.poll();
                    if (tmp.left != null) q1.add(tmp.left);
                    if (tmp.right != null) q1.add(tmp.right);
                    pre = cur;
                    cur = tmp;
                    if (pre != null && cur != null) {
                        pre.next = cur;
                    }
                }
            }
        }
        return root;
    }

}
