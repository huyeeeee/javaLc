package org.leetcode.items._101_200;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Auther: hujiangping
 * @Date: 2023/5/2 14:47
 * @Description: _116_填充每个节点的下一个右侧节点指针
 * @Version 1.0.0
 */
public class _116_填充每个节点的下一个右侧节点指针 {

    public static void main(String[] args) {

        Node r3 = new Node(4);
        Node r4 = new Node(5);
        Node r5 = new Node(6);
        Node r6 = new Node(7);
        Node l1 = new Node(2, r3, r4, null);
        Node l2 = new Node(3, r5, r6, null);

        Node root = new Node(1, l1, l2, null);

        System.out.println(connect(root));
    }

    public Node connect2(Node root) {
        dfs(root,null);
        return root;
    }

    private void dfs(Node cur,Node next){
        if(cur == null) return;
        cur.next = next;
        dfs(cur.left,cur.right);
        dfs(cur.right,cur.next == null ? null : cur.next.left);
    }

    public static Node connect(Node root) {
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
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}


