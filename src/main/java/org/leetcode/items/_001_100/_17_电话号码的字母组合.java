package org.leetcode.items._001_100;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Auther: hujiangping
 * @Date: 2023/4/21 21:26
 * @Description: _17_电话号码的字母组合
 * @Version 1.0.0
 */
public class _17_电话号码的字母组合 {

    public List<String> letterCombinations(String digits) {
        if ("".equals(digits)) return new ArrayList<>();
        String[] letters = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        Queue<String> queue = new ArrayDeque<>();
        queue.add("");
        for(int i = 0;i < digits.length();i++){
            int size = queue.size();
            for(int j = 0;j < size; j++){
                String poll = queue.poll();
                String letter = letters[digits.charAt(i) - '2'];
                for(int k = 0;k < letter.length();k++){
                    queue.add(poll + letter.charAt(k));
                }
            }
        }
        return new ArrayList<>(queue);
    }
}
