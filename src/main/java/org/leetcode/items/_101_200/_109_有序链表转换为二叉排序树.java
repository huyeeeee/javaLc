package org.leetcode.items._101_200;

import com.google.common.collect.Lists;
import org.nodes.ListNode;
import org.nodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hujiangping
 * @Date: 2023/4/29 01:26
 * @Description: _109_有序链表转换为二叉排序树
 * @Version 1.0.0
 */
public class _109_有序链表转换为二叉排序树 {
    public TreeNode sortedListToBST(ListNode head) {
    List<Integer> values = new ArrayList<>();
    while(head != null){
        values.add(head.val);
        head = head.next;
    }
    return dfs(values,0,values.size());
}

    public static TreeNode dfs(List<Integer> values, int s, int e){
        if(s > e)return null;
        int m = s + (e - s) / 2;
        TreeNode r = new TreeNode(values.get(m));
        r.left = dfs(values,s,m-1);
        r.right = dfs(values,m+1,e);
        return r;
    }

    public static void main(String[] args) {
        System.out.println(dfs(Lists.newArrayList(-10, -3, 0, 5, 9), 0, 4));
    }
}