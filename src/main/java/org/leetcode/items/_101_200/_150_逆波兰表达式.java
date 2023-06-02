package org.leetcode.items._101_200;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: hujiangping
 * @Date: 2023/6/2 09:27
 * @Description: _150_逆波兰表达式
 * @Version 1.0.0
 */
public class _150_逆波兰表达式 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if ("+".equals(token)){
                Integer v1 = stack.pop();
                Integer v2 = stack.pop();
                stack.push(v1 + v2);
            }else if ("-".equals(token)){
                Integer v1 = stack.pop();
                Integer v2 = stack.pop();
                stack.push(v2 - v1);
            }else if ("*".equals(token)){
                Integer v1 = stack.pop();
                Integer v2 = stack.pop();
                stack.push(v1 * v2);
            }else if ("/".equals(token)){
                Integer v1 = stack.pop();
                Integer v2 = stack.pop();
                stack.push(v2 / v1);
            }else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
