package org.leetcode.items._101_200;

/**
 * @Author: hujiangping
 * @Date: 2023/6/5 23:51
 * @Description: _165_比较版本号
 * @Version 1.0.0
 */
public class _165_比较版本号 {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int l1 = v1.length - 1;
        int l2 = v2.length - 1;
        while (l1 >= 0 && Integer.parseInt(v1[l1]) == 0){
            l1 -= 1;
        }
        while (l2 >= 0 && Integer.parseInt(v2[l2]) == 0){
            l2 -= 1;
        }
        int c1 = 0,c2 = 0;
        while (c1 <= l1 && c2 <= l2){
            int i1 = Integer.parseInt(v1[c1]);
            int i2 = Integer.parseInt(v2[c2]);
            if (i1 == i2){
                c1 += 1;
                c2 += 1;
            }else if (i1 < i2){
                return -1;
            }else {
                return 1;
            }
        }
        if (c1 <= l1){
            return 1;
        }else if (c2 <= l2){
            return -1;
        }else {
            return 0;
        }
    }
}
