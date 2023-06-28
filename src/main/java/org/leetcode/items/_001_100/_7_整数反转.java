package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/6/28 23:29
 * @Description: _7_整数反转
 * @Version 1.0.0
 */
public class _7_整数反转 {
    public int reverse(int x) {
        Long l = Long.valueOf(x);
        Long l1 = Math.abs(l);
        String s1 = new StringBuilder(l1.toString()).reverse().toString();
        int notZeroIndex = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '0'){
                notZeroIndex += 1;
            }else {
                break;
            }
        }
        s1 = s1.substring(notZeroIndex);
        if (s1.length() == 0) return 0;
        Long l2 = Long.parseLong(s1);
        if (!l1.equals(l)) l2 = -l2;
        if (l2 > Integer.MAX_VALUE || l2 < Integer.MIN_VALUE) return 0;
        return l2.intValue();
    }
}
