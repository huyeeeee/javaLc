package org.leetcode.items._101_200;

import org.leetcode.nodes.TreeNode;

/**
 * @Author: hujiangping
 * @Date: 2023/4/29 00:53
 * @Description: _108_将有序数组转换为二叉搜索树
 * @Version 1.0.0
 */
public class _108_将有序数组转换为二叉搜索树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedSubTree(nums,0,nums.length-1);
    }
    public TreeNode sortedSubTree(int[] nums,int start,int end){
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedSubTree(nums, start,mid - 1);
        root.right = sortedSubTree(nums,mid+1,end);
        return root;
    }
}
