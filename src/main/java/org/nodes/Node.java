package org.nodes;

import java.util.List;

/**
 * @Author: hujiangping
 * @Date: 2023/4/21 21:23
 * @Description: Node
 * @Version 1.0.0
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};