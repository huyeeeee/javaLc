package org.leetcode.items._101_200;

import com.google.common.collect.Lists;
import org.leetcode.nodes.NodeUtils;
import org.leetcode.nodes.TreeNode;

import java.util.logging.Level;

/**
 * @Author: hujiangping
 * @Date: 2023/4/30 16:06
 * @Description: _114_二叉树展开为链表
 * @Version 1.0.0
 */
public class _114_二叉树展开为链表 {
    static StringBuilder s = new StringBuilder();
    public static void flatten(TreeNode root) {
        while (root != null) {
            if (root.left != null) {
                TreeNode pre= root.left;
                while (pre.right != null){
                    pre = pre.right;
                }
                pre.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            root = root.right;
        }
    }

    public static void main(String[] args) {
        flatten(NodeUtils.buildTreeNode(Lists.newArrayList(1, 2, 5, 3, 4, null, 6)));
    }
}
