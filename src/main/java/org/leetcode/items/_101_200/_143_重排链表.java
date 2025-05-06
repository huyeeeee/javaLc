package org.leetcode.items._101_200;

import org.nodes.ListNode;
import org.nodes.NodeUtils;

import java.util.ArrayDeque;

/**
 * @Author: hujiangping
 * @Date: 2023/5/2 15:54
 * @Description: _143_重排链表
 * @Version 1.0.0
 */
public class _143_重排链表 {
    public void reorderList1(ListNode head) {
        if(head == null || head.next == null) return;
        ArrayDeque<ListNode> queue = new ArrayDeque<>();
        ListNode cur = head.next;
        while(cur != null){
            queue.add(cur);
            cur = cur.next;
        }
        boolean isTail = true;
        head.next = null;
        cur = head;
        while(!queue.isEmpty()){
            ListNode tmp = null;
            if(isTail){
                tmp = queue.pollLast();
            }else{
                tmp = queue.pollFirst();
            }
            tmp.next = null;
            cur.next = tmp;
            cur = cur.next;
            isTail = !isTail;
        }
    }

    public static void reorderList(ListNode head) {
        ListNode mid = findMiddle(head);
        ListNode lastHalf = mid.next;
        mid.next = null;
        ListNode revHead = reverse(lastHalf);
        merge(head,revHead);
        System.out.println(head);

    }

    public static void merge(ListNode l1,ListNode l2){
        ListNode t1 = l1;
        ListNode t2 = l2;
        while (t1 != null && t2 != null){
            ListNode next = t1.next;
            t1.next = t2;

            t2 = t2.next;
            t1 = t1.next;
            t1.next = next;
            t1 = t1.next;
        }
    }

    public static ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = NodeUtils.buildNode(new int[]{1, 2, 3, 4, 5});
        reorderList(head);
        System.out.println(head);
    }
}
