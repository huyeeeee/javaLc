package org.leetcode.items._001_100;

import org.leetcode.nodes.ListNode;

/**
 * @Auther: hujiangping
 * @Date: 2023/4/21 21:34
 * @Description: _23_合并K个升序链表
 * @Version 1.0.0
 */
public class _23_合并K个升序链表 {

    public ListNode mergeKLists1(ListNode[] lists) {
        ListNode res = new ListNode(Integer.MIN_VALUE);
        for (ListNode l : lists){
            res = mergeTwoList(res,l);
        }
        return res.next;
    }

    public ListNode mergeTwoList(ListNode l1,ListNode l2){
        ListNode result = new ListNode(-1);
        ListNode cur = result;
        while (l1 != null && l2 != null){
            if (l1.val > l2.val){
                cur.next = new ListNode(l2.val);
                l2 = l2.next;
            }else {
                cur.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            cur = cur.next;
        }
        if (l1 == null){
            cur.next = l2;
        }
        if (l2 == null){
            cur.next = l1;
        }
        return result.next;
    }
}
