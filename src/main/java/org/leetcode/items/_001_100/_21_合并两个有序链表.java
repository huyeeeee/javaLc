package org.leetcode.items._001_100;

import org.leetcode.nodes.ListNode;

/**
 * @Author: hujiangping
 * @Date: 2023/4/21 21:32
 * @Description: _21_合并两个有序链表
 * @Version 1.0.0
 */
public class _21_合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode cur = result;
        while (l1 != null && l2 != null){
            if (l1.val > l2.val){
                cur.next = new ListNode(l2.val);
                l2 = l2.next;
            }else{
                cur.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            cur = cur.next;
        }
        if (l1 != null){
            cur.next = l1;
        }
        if (l2 != null){
            cur.next = l2;
        }
        return result.next;
    }
}
