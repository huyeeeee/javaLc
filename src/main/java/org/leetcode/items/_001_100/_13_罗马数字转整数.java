package org.leetcode.items._001_100;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hujiangping
 * @Date: 2023/5/30 10:32
 * @Description: _14_罗马数字转整数
 * @Version 1.0.0
 */
public class _13_罗马数字转整数 {
    static Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public static int romanToInt(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer integer = map.get(c);
            if (c == 'I' || c == 'X' || c == 'C') {
                if (i < s.length() - 1) {
                    char nextC = s.charAt(i + 1);
                    if (c == 'I' && (nextC == 'V' || nextC == 'X') ){
                        integer = -integer;
                    }else if (c == 'X' && (nextC == 'L' || nextC == 'C') ){
                        integer = -integer;
                    }else if (c == 'C' && (nextC == 'D' || nextC == 'M') ){
                        integer = -integer;
                    }
                }
            }
            count += integer;
        }
        return count;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(romanToInt(""));
        }
    }
}
