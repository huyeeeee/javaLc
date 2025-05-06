package org.leetcode.items._001_100;

import org.nodes.ListNode;

/**
 * @Author: hujiangping
 * @Date: 2023/4/26 10:00
 * @Description: _61_旋转链表
 * @Version 1.0.0
 */
public class _61_旋转链表 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        System.out.println(rotateRight1(l1, 2000000000));
    }
    public static ListNode rotateRight1(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) return head;
        ListNode tail = head;
        int length = 1;
        while(tail.next != null){
            tail = tail.next;
            length += 1;
        }
        k = length - k % length;
        tail.next = head;
        while(k > 0){
            head = head.next;
            tail = tail.next;
            k--;
        }
        tail.next = null;
        return head;

    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode pre = null;
        ListNode cur = head;
        int length = 0;
        while(cur != null){
            cur = cur.next;
            length += 1;
        }
        k = k % length;
        while (k > 0){
            head = rotateRightOnce(head);
            k--;
        }
        return head;
    }
    public ListNode rotateRightOnce(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur.next != null){
            pre = cur;
            cur = cur.next;
        }
        pre.next = null;
        cur.next = head;
        return cur;
    }
}
