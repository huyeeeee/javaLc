package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/5/30 10:03
 * @Description: _8_字符串转换整数
 * @Version 1.0.0
 */
public class _8_字符串转换整数 {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isPositive = true;
        boolean isFirst = true;
        boolean isStartZero = true;
        for (char c : s.trim().toCharArray()) {
            if (sb.length() > 12) {
                break;
            }
            if (isFirst && isPositive) {
                isFirst = false;
                if (c == '-') {
                    isPositive = false;
                    continue;
                } else if (c == '+') {
                    continue;
                }
            }
            if (c >= '0' && c <= '9') {
                if (c != '0') {
                    isStartZero = false;
                }
                if (isStartZero && c == '0') continue;
                sb.append(c);
            } else {
                break;
            }
            isFirst = false;
        }
        if (sb.toString().length() == 0) {
            return 0;
        }
        long l = Long.parseLong(sb.toString());
        if (!isPositive) {
            l = -l;
        }
        if (l > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (l < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) l;
    }
}
