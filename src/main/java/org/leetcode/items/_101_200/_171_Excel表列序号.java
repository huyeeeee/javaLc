package org.leetcode.items._101_200;

/**
 * @Author: hujiangping
 * @Date: 2023/6/5 23:52
 * @Description: _171_Excel表列序号
 * @Version 1.0.0
 */
public class _171_Excel表列序号 {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        int base = 1;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            res += (columnTitle.charAt(i) - 'A' + 1) * base;
            base *= 26;
        }
        return res;
    }
}
