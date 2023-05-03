package org.leetcode.items._101_200;

import org.leetcode.nodes.ListNode;
import org.leetcode.nodes.NodeUtils;

import java.util.List;


/**
 * @Auther: hujiangping
 * @Date: 2023/5/3 14:17
 * @Description: _147_对链表进行插入排序
 * @Version 1.0.0
 */
public class _147_对链表进行插入排序 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummyHead = new ListNode(-5001);
        dummyHead.next = head;
        ListNode pre;
        ListNode cur;
        ListNode sTail = head;
        ListNode uHead = head.next;
        while (uHead != null){
            boolean isSort = false;
            cur = dummyHead.next;
            pre = dummyHead;
            while (cur != uHead && uHead != null){
                if (cur.val > uHead.val){
                    ListNode next = uHead.next;
                    uHead.next = null;
                    ListNode tmp = new ListNode(uHead.val);
                    pre.next = tmp;
                    tmp.next = cur;
                    sTail.next = next;
                    uHead = next;
                    isSort = true;
                    break;
                }else {
                    cur = cur.next;
                    pre = pre.next;
                }
                if (!isSort) {
                    isSort = !isSort;
                    uHead = uHead.next;
                }
            }
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        System.out.println(new _147_对链表进行插入排序().insertionSortList(NodeUtils.buildNode(new int[]{4,1,2,3})));
    }
}
