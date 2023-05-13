package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/5/5 20:55
 * @Description: _67_二进制求和
 * @Version 1.0.0
 */
public class _67_二进制求和 {
    public String addBinary(String a, String b) {
        String res = "";
        int la = a.length();
        int lb = b.length();
        int isTen = 0;
        while(la != 0 && lb != 0){
            int t = a.charAt(--la) - '0' + b.charAt(--lb) - '0' + isTen;
            if (t == 2 || t == 3){
                isTen = 1;
                t = t - 2;
            } else{
                isTen = 0;
            }
            res = t + res;
        }
        while (la != 0){
            int t = a.charAt(--la) - '0' + isTen;
            if (t == 2 ){
                isTen = 1;
                t = t - 2;
            } else{
                isTen = 0;
            }
            res = t + res;
        }
        while (lb != 0){
            int t = b.charAt(--lb) - '0' + isTen;
            if (t == 2 ){
                isTen = 1;
                t = t - 2;
            } else{
                isTen = 0;
            }
            res = t + res;
        }
        res = isTen == 1 ? isTen + res : res;

        return res;
    }
}
