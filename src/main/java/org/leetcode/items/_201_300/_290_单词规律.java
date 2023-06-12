package org.leetcode.items._201_300;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hujiangping
 * @Date: 2023/6/12 20:38
 * @Description: _290_单词规律
 * @Version 1.0.0
 */
public class _290_单词规律 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        Map<String,Character> map1 = new HashMap<>();
        String[] s1 = s.split(" ");
        if (s1.length != pattern.length()) return false;
        for (int i = 0; i < s1.length; i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c) && !map.get(c).equals(s1[i])) return false;
            if (map1.containsKey(s1[i]) && !map1.get(s1[i]).equals(c)) return false;
            map.put(c,s1[i]);
            map1.put(s1[i],c);

        }
        return true;
    }
}
