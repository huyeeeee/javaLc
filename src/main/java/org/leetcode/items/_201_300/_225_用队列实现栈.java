package org.leetcode.items._201_300;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: hujiangping
 * @Date: 2023/7/17 14:15
 * @Description: _225_用队列实现栈
 * @Version 1.0.0
 */
public class _225_用队列实现栈 {
}
class MyStack {
    Deque<Integer> d1;
    Deque<Integer> d2;


    public MyStack() {
        d1 = new ArrayDeque<>();
        d2 = new ArrayDeque<>();
    }

    public void push(int x) {
        if (d2.isEmpty()){
            d1.addLast(x);
        }else {
            d2.addLast(x);
        }
    }

    public int pop() {
        if (d2.isEmpty()){
            while (!d1.isEmpty()){
                if (d1.size() == 1){
                    return d1.poll();
                }
                d2.addLast(d1.poll());
            }
        }else {
            while (!d2.isEmpty()){
                if (d2.size() == 1){
                    return d2.poll();
                }
                d1.addLast(d2.poll());
            }
        }
        return -1;
    }

    public int top() {
        int pop = pop();
        push(pop);
        return pop;
    }

    public boolean empty() {
        return d1.isEmpty() && d2.isEmpty();
    }
}
