package org.leetcode.items._001_100;

import org.leetcode.nodes.ListNode;
import org.leetcode.nodes.NodeUtils;

/**
 * @Auther: hujiangping
 * @Date: 2023/4/30 17:21
 * @Description: _25_K个一组反转链表
 * @Version 1.0.0
 */
public class _25_K个一组反转链表 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode start = head;
        ListNode end = head;
        while(start != null){
            for(int i = 1;i < k && end != null;i++) end = end.next;
            if(end == null) break;
            ListNode next = end.next;
            end.next = null;
            pre.next = reverse(start);
            while (pre.next != null) pre = pre.next;
            start = next;
            end = next;
        }
        pre.next = start;
        return dummy.next;
    }

    public static ListNode reverse(ListNode head){
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
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(reverseKGroup(NodeUtils.buildNode(nums), 3));
    }
}
