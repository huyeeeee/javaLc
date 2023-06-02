package org.leetcode.items._101_200;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: hujiangping
 * @Date: 2023/6/2 20:46
 * @Description: _151_反转字符串中的单词
 * @Version 1.0.0
 */
public class _151_反转字符串中的单词 {
    public String reverseWords(String s) {
        s = s.trim();
        char pre = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (pre == ' ' && c == ' ') {
                continue;
            }
            stringBuilder.append(c);

            pre = c;
        }
        List<String> collect = Arrays.stream(stringBuilder.toString().split(" ")).collect(Collectors.toList());
        Collections.reverse(collect);
        return String.join(" ",collect);
    }
}
