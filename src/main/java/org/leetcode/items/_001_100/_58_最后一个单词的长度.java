package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/5/15 20:20
 * @Description: _58_最后一个单词的长度
 * @Version 1.0.0
 */
public class _58_最后一个单词的长度 {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' '){
                length += 1;
            }else if (length == 0 && s.charAt(i) == ' '){
                continue;
            }else {
                return length;
            }
        }
        return length;
    }
}
