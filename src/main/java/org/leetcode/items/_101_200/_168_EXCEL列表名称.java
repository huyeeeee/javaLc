package org.leetcode.items._101_200;

/**
 * @Author: hujiangping
 * @Date: 2023/5/30 15:31
 * @Description: _168
 * @Version 1.0.0
 */
public class _168_EXCEL列表名称 {
    public static String convertToTitle(int columnNumber) {
        StringBuilder s = new StringBuilder();
        while (columnNumber > 0){
            columnNumber -= 1;
            s.insert(0, (char)(columnNumber % 26 + 'A'));
            columnNumber = columnNumber / 26;
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
    }
}
