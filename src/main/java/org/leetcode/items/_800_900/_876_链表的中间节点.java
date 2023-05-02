package org.leetcode.items._800_900;

import org.leetcode.nodes.ListNode;
import org.leetcode.nodes.NodeUtils;

/**
 * @Auther: hujiangping
 * @Date: 2023/4/30 15:16
 * @Description: _876_链表的中间节点
 * @Version 1.0.0
 */
public class _876_链表的中间节点 {
    public static ListNode middleNode1(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode cur = head;
        int l = 0;
        while(cur != null){
            l += 1;
            cur = cur.next;
        }
        l = l / 2;
        while (l-- > 0){
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println(middleNode1(NodeUtils.buildNode(new int[]{1, 2, 3, 4, 5,6})));
    }
}
