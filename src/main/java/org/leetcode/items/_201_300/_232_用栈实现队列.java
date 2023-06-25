package org.leetcode.items._201_300;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: hujiangping
 * @Date: 2023/6/25 20:40
 * @Description: _232_用栈实现队列
 * @Version 1.0.0
 */
public class _232_用栈实现队列 {
    class MyQueue {
        Deque<Integer> s1;
        Deque<Integer> s2;

        public MyQueue() {
            s1 = new ArrayDeque<>();
            s2 = new ArrayDeque<>();
        }

        public void push(int x) {
            if (s1.isEmpty()) {
                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            }
            s1.push(x);
        }

        public int pop() {
            if (!s1.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

        public int peek() {
            if (!s1.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }

        public boolean empty() {
            return s1.isEmpty() && s2.isEmpty();
        }
    }
}
