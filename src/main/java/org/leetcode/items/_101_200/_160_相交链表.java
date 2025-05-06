package org.leetcode.items._101_200;

import org.nodes.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hujiangping
 * @Date: 2023/5/3 15:31
 * @Description: _160_相交链表
 * @Version 1.0.0
 */
public class _160_相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Integer> map = new HashMap<>();
        while(headA != null){
            map.put(headA,headA.hashCode());
            headA = headA.next;
        }
        while(headB != null){
            if(map.containsKey(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while(a != b){
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
