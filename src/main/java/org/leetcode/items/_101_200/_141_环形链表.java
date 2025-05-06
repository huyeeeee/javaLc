package org.leetcode.items._101_200;

import org.nodes.ListNode;

/**
 * @Author: hujiangping
 * @Date: 2023/4/28 11:30
 * @Description: _141_环形链表
 * @Version 1.0.0
 */
public class _141_环形链表 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode fast = head.next;
        while (head != null && fast != null) {
            if (head == fast) return true;
            head = head.next;
            fast = fast.next;
            if (fast == null) return false;
            else fast = fast.next;
        }
        return false;
    }
}
