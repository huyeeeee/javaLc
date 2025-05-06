package org.leetcode.items._001_100;

import org.nodes.ListNode;

/**
 * @Author: hujiangping
 * @Date: 2023/4/23 20:44
 * @Description: _24_两两交换链表中的节点
 * @Version 1.0.0
 */
public class _24_两两交换链表中的节点 {

    public ListNode swapPairs(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        while (head != null && head.next != null){
            cur.next = new ListNode(head.next.val);
            cur.next.next = new ListNode(head.val);
            head = head.next.next;
            cur = cur.next.next;
        }
        if (head != null){
            cur.next = head;
        }
        return pre.next;

    }
    public ListNode swapPairs1(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        while (head != null && head.next != null){
            cur.next = new ListNode(head.next.val);
            cur.next.next = new ListNode(head.val);
            head = head.next.next;
            cur = cur.next.next;
        }
        if (head != null){
            cur.next = head;
        }
        return pre.next;

    }
}
