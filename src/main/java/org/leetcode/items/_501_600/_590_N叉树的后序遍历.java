package org.leetcode.items._501_600;

import org.nodes.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: hujiangping
 * @Date: 2023/4/21 21:27
 * @Description: _590_N叉树的后序遍历
 * @Version 1.0.0
 */
public class _590_N叉树的后序遍历 {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(stack.size() != 0){
            Node n = stack.peek();
            if(n != null){
                for(int i = n.children.size() - 1;i >=0;i--){
                    stack.push(n.children.get(i));
                }
            }
        }
        return list;
    }
}
