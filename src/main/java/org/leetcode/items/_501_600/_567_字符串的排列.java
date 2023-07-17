package org.leetcode.items._501_600;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hujiangping
 * @Date: 2023/7/17 14:06
 * @Description: _567_字符串的排列
 * @Version 1.0.0
 */
public class _567_字符串的排列 {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            boolean isBad = false;
            if (map.containsKey(s2.charAt(i))) {
                Map<Character, Integer> temp = new HashMap<>(map);
                for (int j = i; j < i + s1.length(); j++) {
                    if (i+s1.length() > s2.length()){
                        isBad = true;
                        break;
                    }
                    char c = s2.charAt(j);
                    if (temp.containsKey(c)) {
                        Integer ic = temp.get(c);
                        if (ic <= 1) temp.remove(c);
                        else temp.put(c, ic - 1);
                    } else {
                        isBad = true;
                        break;
                    }
                }
                if (!isBad){
                    return true;
                }
            }
        }
        return false;
    }
}
