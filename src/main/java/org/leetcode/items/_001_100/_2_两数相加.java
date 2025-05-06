package org.leetcode.items._001_100;

import org.nodes.ListNode;

/**
 * @Author: hujiangping
 * @Date: 2023/4/21 21:15
 * @Description: _2_两数相加
 * @Version 1.0.0
 */
public class _2_两数相加 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return subAdd(l1, l2, 0);
    }

    public ListNode subAdd(ListNode l1, ListNode l2, int b) {
        if (l1 == null && l2 == null && b == 0) {
            return null;
        }
        int val = b;
        if (l1 != null) {
            val += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            val += l2.val;
            l2 = l2.next;
        }
        ListNode l = new ListNode(val % 10);
        l.next = subAdd(l1, l2, val / 10);
        return l;
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        int isTen = 0;
        ListNode l3 = new ListNode(-1);
        ListNode temp = l3;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val + isTen;
            if (val >= 10) {
                isTen = 1;
                val -= 10;
            } else {
                isTen = 0;
            }
            temp.next = new ListNode(val);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int val = l1.val + isTen;
            if (val >= 10) {
                isTen = 1;
                val -= 10;
            } else {
                isTen = 0;
            }
            temp.next = new ListNode(val);
            temp = temp.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            int val = l2.val + isTen;
            if (val >= 10) {
                isTen = 1;
                val -= 10;
            } else {
                isTen = 0;
            }
            temp.next = new ListNode(val);
            temp = temp.next;
            l2 = l2.next;
        }
        if (isTen == 1) {
            temp.next = new ListNode(1);
        }
        return l3.next;
    }
}
