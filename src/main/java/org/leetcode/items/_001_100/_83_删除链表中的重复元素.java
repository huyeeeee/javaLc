package org.leetcode.items._001_100;

import org.leetcode.nodes.ListNode;

/**
 * @Author: hujiangping
 * @Date: 2023/4/28 09:56
 * @Description: _83_删除链表中的重复元素
 * @Version 1.0.0
 */
public class _83_删除链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = new ListNode(-101);
        ListNode cur = head;
        while (cur != null) {
            if (pre.val == cur.val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }


}
