package org.leetcode.items._201_300;

/**
 * @Author: hujiangping
 * @Date: 2023/6/8 23:39
 * @Description: _201_数字范围按位与
 * @Version 1.0.0
 */
public class _201_数字范围按位与 {
    public int rangeBitwiseAnd(int m, int n) {
        char[] cm = Integer.toBinaryString(m).toCharArray();
        char[] cn = Integer.toBinaryString(n).toCharArray();
        if (cm.length != cn.length){
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        int i;
        for (i = 0; i < cm.length; i++) {
            if (cm[i] == cn[i]){
                sb.append(cm[i]);
            }else {
                break;
            }
        }
        for (; i < cm.length; i++) {
            sb.append(0);
        }
        return Integer.valueOf(sb.toString(),2);
    }
}
