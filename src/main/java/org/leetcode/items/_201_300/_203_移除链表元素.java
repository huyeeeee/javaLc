package org.leetcode.items._201_300;

import org.nodes.ListNode;
import org.nodes.NodeUtils;

/**
 * @Author: hujiangping
 * @Date: 2023/4/30 15:47
 * @Description: _203_移除链表元素
 * @Version 1.0.0
 */
public class _203_移除链表元素 {
    public ListNode removeElements1(ListNode head, int val) {
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        while(head != null){
            if(head.val == val){
                head = head.next;
                continue;
            }
            cur.next = new ListNode(head.val);

            cur = cur.next;
            head = head.next;
        }
        return newHead.next;
    }

    public static ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        if(head.val == val) removeElements(head.next,val);
        head.next = removeElements(head.next,val);
        if (head.val == val) return head.next;
        return head;
    }

    public static void main(String[] args) {
        System.out.println(removeElements(NodeUtils.buildNode(new int[]{1, 2, 3, 4, 5, 4}), 4));
    }
}
