package org.leetcode.items._001_100;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: hujiangping
 * @Date: 2023/4/21 21:16
 * @Description: _3_无重复字符的最长子串
 * @Version 1.0.0
 */
public class _3_无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        Deque<Character> queue = new ArrayDeque<>();
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (queue.contains(c)){
                queue.pollLast();
            }
            queue.addFirst(c);
            maxLength = Math.max(maxLength,queue.size());
        }
        return maxLength;
    }
}
