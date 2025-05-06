package org.leetcode.items._001_100;

import org.nodes.ListNode;

/**
 * @Author: hujiangping
 * @Date: 2023/4/30 17:46
 * @Description: _86_分隔链表
 * @Version 1.0.0
 */
public class _86_分隔链表 {
    public ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(-1);
        ListNode small = smallDummy;
        ListNode bigDummy = new ListNode(-1);
        ListNode big = bigDummy;
        while(head != null){
            if(head.val < x){
                small.next = new ListNode(head.val);
                small = small.next;
            }else{
                big.next = new ListNode(head.val);
                big = big.next;
            }
            head = head.next;
        }
        small.next = bigDummy.next;
        return smallDummy.next;
    }
}
