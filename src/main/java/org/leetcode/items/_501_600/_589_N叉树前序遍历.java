package org.leetcode.items._501_600;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.nodes.Node;

/**
 * @Author: hujiangping
 * @Date: 2023/4/21 21:22
 * @Description: _589_N叉树前序遍历
 * @Version 1.0.0
 */
public class _589_N叉树前序遍历 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null) return list;
        list.add(root.val);
        for(Node node : root.children){
            preorder(node);
        }
        return list;
    }

    public List<Integer> preorder1(Node root) {
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (stack.size() != 0){
            Node cur = stack.pop();
            if (cur != null){
                list.add(cur.val);
                if (cur.children != null || cur.children.size() != 0){
                    for (int i = cur.children.size() - 1; i >= 0; i--) {
                        stack.push(cur.children.get(i));
                    }
                }
            }
        }
        return list;
    }
}
