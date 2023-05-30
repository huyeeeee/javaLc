package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/5/30 10:03
 * @Description: _8_字符串转换整数
 * @Version 1.0.0
 */
public class _8_字符串转换整数 {
    public static int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isNeg = false;
        boolean isDone = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!isDone){
                if ((c >= '0' && c <= '9') || c == '-'){
                    if (c == '-'){
                        if (!isNeg){
                            isNeg = true;
                        }else {
                            break;
                        }
                    }else {
                        sb.append(c);
                    }
                }else {
                    if (sb.length() > 0){
                        isDone = true;
                    }
                }
            }
        }
        if (sb.length() == 0) return 0;
        int i = Integer.parseInt(sb.toString());
        return isNeg ? -i : i;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("with words 4193"));
    }
}
