package org.leetcode.items._201_300;

import org.nodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hujiangping
 * @Date: 2023/6/15 23:50
 * @Description: _257_二叉树的所有路径
 * @Version 1.0.0
 */
public class _257_二叉树的所有路径 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;
        List<Integer> path = new ArrayList<>();
        path.add(root.val);
        dfs(root,path,res);
        return res;
    }

    private void dfs(TreeNode root, List<Integer> path, List<String> res) {
        if (root.left == null && root.right == null){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < path.size(); i++) {
                sb.append(path.get(i));
                if (i != path.size() - 1){
                    sb.append("->");
                }
            }
            res.add(sb.toString());
            return;
        }
        if (root.left != null){
            path.add(root.left.val);
            dfs(root.left,path,res);
            path.remove(path.lastIndexOf(root.left.val));
        }
        if (root.right != null){
            path.add(root.right.val);
            dfs(root.right,path,res);
            path.remove(path.lastIndexOf(root.right.val));
        }

    }
}
