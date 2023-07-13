package org.leetcode.items._1000_1100;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * @Author: hujiangping
 * @Date: 2023/7/13 23:15
 * @Description: _1047_删除字符串中的所有相邻重复项
 * @Version 1.0.0
 */
public class _1047_删除字符串中的所有相邻重复项 {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()){
                stack.push(s.charAt(i));
            }else {
                Character peek = stack.peek();
                if (peek == s.charAt(i)){
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new _1047_删除字符串中的所有相邻重复项().removeDuplicates("abbbaca"));
    }
}
