package org.leetcode.items._201_300;

import org.leetcode.nodes.ListNode;
import org.leetcode.nodes.NodeUtils;

/**
 * @Author: hujiangping
 * @Date: 2023/4/30 15:26
 * @Description: _234_回文链表
 * @Version 1.0.0
 */
public class _234_回文链表 {
    public static boolean isPalindrome(ListNode head) {
        String s = buildValues(head);
        ListNode reverse = reverse(head);
        return s.equals(buildValues(reverse));
    }

    public static String buildValues(ListNode l1){
        StringBuilder s = new StringBuilder();
        while (l1 != null){
            s.append(l1.val);
            l1 = l1.next;
        }
        return s.toString();
    }

    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode cur = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(NodeUtils.buildNode(new int[]{1, 2, 3, 4, 5})));
    }
}
