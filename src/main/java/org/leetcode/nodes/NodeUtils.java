package org.leetcode.nodes;

import java.util.List;

/**
 * @Auther: hujiangping
 * @Date: 2023/4/21 20:04
 * @Description: NodeUtils
 * @Version 1.0.0
 */
public class NodeUtils {

    public static ListNode buildNode(List<Integer> values){
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        for (Integer value : values) {
            cur.next = new ListNode(value);
            cur = cur.next;
        }
        return head.next;
    }

    public static ListNode buildNode(int[] values){
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        for (int value : values) {
            cur.next = new ListNode(value);
            cur = cur.next;
        }
        return head.next;
    }

}
