package org.leetcode.items._001_100;

import org.leetcode.nodes.ListNode;

/**
 * @Auther: hujiangping
 * @Date: 2023/4/21 21:33
 * @Description: _19_删除链表的倒数第n个节点
 * @Version 1.0.0
 */
public class _19_删除链表的倒数第n个节点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        ListNode pre = head;
        while (n-- >= 0){
            if (cur == null) return head.next;
            cur = cur.next;
        }
        while (cur != null){
            cur = cur.next;
            pre = pre.next;
        }
        if (pre.next != null) pre.next = pre.next.next;
        else pre = null;
        return head;
    }
}
