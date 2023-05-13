package org.leetcode.items._001_100;

import org.leetcode.nodes.ListNode;
import org.leetcode.nodes.NodeUtils;

/**
 * @Author: hujiangping
 * @Date: 2023/4/28 20:08
 * @Description: _92_链表反转II
 * @Version 1.0.0
 */
public class _92_链表反转II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right) return head;
        ListNode curLeft = head;
        ListNode curRight = head;
        ListNode preLeft = null;
        ListNode behindRight = null;
        while(right > 0){
            if (left > 1){
                preLeft = curLeft;
                curLeft = curLeft.next;
                left -= 1;
            }
            curRight = curRight.next;
            behindRight = curRight;
            right -= 1;
        }
        ListNode realLeft = reverse(curLeft,curRight);
        if (preLeft == null){
            head = realLeft;
        }else {
            preLeft.next = realLeft;
        }
        while(realLeft.next != null){
            realLeft = realLeft.next;
        }
        realLeft.next = behindRight;
        return head;
    }

    public ListNode reverse(ListNode head,ListNode tail){
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        while(cur != tail) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        System.out.println(new _92_链表反转II().reverseBetween(NodeUtils.buildNode(new int[]{3,5}), 1, 2));
    }
}
