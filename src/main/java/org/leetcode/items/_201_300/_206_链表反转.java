package org.leetcode.items._201_300;

import com.google.common.collect.Lists;
import org.nodes.ListNode;
import org.nodes.NodeUtils;

/**
 * @Author: hujiangping
 * @Date: 2023/4/21 21:28
 * @Description: _206_链表反转
 * @Version 1.0.0
 */
public class _206_链表反转 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
    public ListNode reverseList1(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        while (cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }



    public static void main(String[] args) {
        ListNode listNode = NodeUtils.buildNode(Lists.newArrayList(1, 3, 4, 5, 6));
        System.out.println(new _206_链表反转().reverseList(listNode));
    }
}
