package org.leetcode.items._001_100;

import org.leetcode.nodes.ListNode;
import org.leetcode.nodes.NodeUtils;

import java.util.HashMap;

/**
 * @Auther: hujiangping
 * @Date: 2023/4/28 09:58
 * @Description: _82_删除排序链表中的重复元素II
 * @Version 1.0.0
 */
public class _82_删除排序链表中的重复元素II {
    public static void main(String[] args) {
        ListNode listNode = NodeUtils.buildNode(new int[]{1,1});
        System.out.println(deleteDuplicates(listNode));
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node = new ListNode(-1);
        if (head == null || head.next == null) return head;
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode pre = node;
        ListNode cur = head;
        while (cur != null) {
            if (map.containsKey(cur.val)) {
                map.put(cur.val, map.get(cur.val) + 1);
            } else {
                map.put(cur.val, 1);
            }
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            if (map.get(cur.val) <= 1) {
                pre.next = new ListNode(cur.val);
                pre = pre.next;
            }
            cur = cur.next;
        }
        return node.next;
    }
}
