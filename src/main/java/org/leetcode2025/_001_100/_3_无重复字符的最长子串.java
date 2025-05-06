package org.leetcode2025._001_100;

import java.util.ArrayDeque;
import java.util.Deque;

public class _3_无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (deque.contains(c)){
                deque.pollLast();
            }
            deque.addFirst(c);
            maxLength = Math.max(maxLength, deque.size());
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(new _3_无重复字符的最长子串().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new _3_无重复字符的最长子串().lengthOfLongestSubstring("bbbb"));
        System.out.println(new _3_无重复字符的最长子串().lengthOfLongestSubstring("pwwkew"));
    }
}
