package org.leetcode.items._101_200;

import java.util.*;

/**
 * @Author: hujiangping
 * @Date: 2023/5/30 15:06
 * @Description: _131_分割回文串
 * @Version 1.0.0
 */
public class _131_分割回文串 {
    public List<List<String>> partition(String s) {
        int length = s.length();
        List<List<String>> res = new ArrayList<>();
        if (length == 0) return res;
        Deque<String> path = new ArrayDeque<>();
        char[] charArray = s.toCharArray();
        dfs(charArray, length, path, 0, res);
        return res;
    }

    private void dfs(char[] chars, int length, Deque<String> path, int count, List<List<String>> res) {
        if (count == length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = count; i < length; i++) {
            if (!isPalindrome(chars,count,i)){
                continue;
            }
            path.addLast(new String(chars,count,i + 1 -count));
            dfs(chars,length,path,i + 1,res);
            path.removeLast();
        }
    }

    private boolean isPalindrome(char[] chars,int l,int r){
        while (l < r){
            if (chars[l] != chars[r])return false;
            l ++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new _131_分割回文串().partition("aab"));
    }
}
