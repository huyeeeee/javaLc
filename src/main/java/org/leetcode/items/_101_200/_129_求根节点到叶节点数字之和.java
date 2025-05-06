package org.leetcode.items._101_200;

import com.google.common.collect.Lists;
import org.nodes.NodeUtils;
import org.nodes.TreeNode;

/**
 * @Author: hujiangping
 * @Date: 2023/5/29 17:45
 * @Description: _129_求根节点到叶节点数字之和
 * @Version 1.0.0
 */
public class _129_求根节点到叶节点数字之和 {
    public static int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }

    public static int dfs(TreeNode root, int preSum){
        if (root == null) return 0;
        int sum = preSum * 10 + root.val;
        if (root.left == null && root.right == null){
            return sum;
        }else {
            return dfs(root.right,sum) + dfs(root.left,sum);
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = NodeUtils.buildTreeNode(Lists.newArrayList(1, 2, 3));
        System.out.println(sumNumbers(treeNode));
    }
}
