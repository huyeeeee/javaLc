package org.leetcode.items._201_300;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hujiangping
 * @Date: 2023/6/8 23:41
 * @Description: _205_同构字符串
 * @Version 1.0.0
 */
public class _205_同构字符串 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        Map<Character,Character> map1 = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if (map.containsKey(cs)){
                if (!map.get(cs).equals(ct)){
                    return false;
                }
            }else {
                map.put(cs,ct);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char cs = t.charAt(i);
            char ct = s.charAt(i);
            if (map1.containsKey(cs)){
                if (!map1.get(cs).equals(ct)){
                    return false;
                }
            }else {
                map1.put(cs,ct);
            }
        }
        return true;
    }
}
