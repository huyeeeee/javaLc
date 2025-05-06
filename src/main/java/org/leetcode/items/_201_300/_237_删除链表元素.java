package org.leetcode.items._201_300;

import org.nodes.ListNode;

/**
 * @Author: hujiangping
 * @Date: 2023/4/30 15:46
 * @Description: _237_删除链表元素
 * @Version 1.0.0
 */
public class _237_删除链表元素 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
