package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/6/26 21:45
 * @Description: _6_n字形变换
 * @Version 1.0.0
 */
public class _6_N字形变换 {
    public String convert(String s, int numRows) {
        if (numRows < 2) return s;
        StringBuilder[] ss = new StringBuilder[numRows];
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (ss[count] == null) ss[i] = new StringBuilder();
            ss[count].append(s.charAt(i));
            if (flag) count -= 1;
            else count += 1;
            if (count == numRows - 1) flag = true;
            if (count == 0) flag = false;
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            if (ss[i] != null) res.append(ss[i]);
        }
        return res.toString();
    }
}
