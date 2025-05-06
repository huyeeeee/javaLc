package org.leetcode.items._101_200;

import org.nodes.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: hujiangping
 * @Date: 2023/6/2 09:26
 * @Description: _48_排序链表
 * @Version 1.0.0
 */
public class _148_排序链表 {
    public ListNode sortList(ListNode head) {
        List<Integer> values = new ArrayList<>();
        if (head == null || head.next == null) return head;
        ListNode temp = head;
        while (temp != null){
            values.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(values);
        ListNode dummy = new ListNode(-1);
        temp = dummy;
        for (int i = 0; i < values.size(); i++) {
            temp.next = new ListNode(values.get(i));
            temp = temp.next;
        }
        return dummy.next;
    }
}
