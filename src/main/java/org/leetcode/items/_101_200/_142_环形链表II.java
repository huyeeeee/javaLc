package org.leetcode.items._101_200;

import org.leetcode.nodes.ListNode;

/**
 * @Auther: hujiangping
 * @Date: 2023/4/28 12:18
 * @Description: _142_环形链表II
 * @Version 1.0.0
 */
public class _142_环形链表II {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode s = head;
        ListNode f = head;
        do{
            s = s.next;
            f = f.next;
            if(f == null || f.next == null) return null;
            else f = f.next;
        }while(s != f);
        f = head;
        while(s != f){
            s = s.next;
            f = f.next;
        }
        return s;
    }
}
