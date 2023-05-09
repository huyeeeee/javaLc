package org.leetcode.items._001_100;

import org.leetcode.nodes.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * @Auther: hujiangping
 * @Date: 2023/5/9 21:51
 * @Description: _98_验证二叉搜索树
 * @Version 1.0.0
 */
public class _98_验证二叉搜索树 {
    List<Integer> l = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        long min = (long)Integer.MIN_VALUE - 1;
        for (int i = 0; i < l.size(); i++) {
            if (min < l.get(i)){
                min = l.get(i);
            }else {
                return false;
            }
        }
        return true;
    }
    public boolean isValidBST1(TreeNode root) {
        inOrder(root);
        List l1 = new ArrayList<>(l);
        Collections.sort(l1);
        return l.size() == new HashSet<>(l).size() && l1.equals(l);
    }

    public void inOrder(TreeNode r){
        if (r == null) return;
        inOrder(r.left);
        l.add(r.val);
        inOrder(r.right);
    }
}
