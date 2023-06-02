package org.leetcode.items._101_200;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: hujiangping
 * @Date: 2023/6/2 20:48
 * @Description: _155_最小栈
 * @Version 1.0.0
 */
public class _155_最小栈 {
    Deque<Integer> stack;
    Deque<Integer> minStack;
    public _155_最小栈() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        minStack.push(Math.min(minStack.peek(),val));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
