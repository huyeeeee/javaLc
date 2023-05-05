package org.leetcode.items._001_100;

/**
 * @Auther: hujiangping
 * @Date: 2023/5/5 20:53
 * @Description: _43_字符串相乘
 * @Version 1.0.0
 */
public class _43_字符串相乘 {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) return "0";
        String res = "";
        String dig = "";
        int biggerThanTen = 0;
        for (int i = num2.length() - 1; i >= 0; i--) {
            String tmp = "";
            biggerThanTen = 0;
            for (int j = num1.length() - 1; j >= 0; j--) {
                int t = (num1.charAt(j) - '0') * (num2.charAt(i) - '0') + biggerThanTen;
                if (t >= 10){
                    biggerThanTen = t /10;
                }else {
                    biggerThanTen = 0;
                }
                t = t % 10;
                tmp = t + tmp;
            }
            tmp = tmp + dig;
            if (biggerThanTen > 0){
                tmp = biggerThanTen + tmp;
            }
            dig += "0";
            res = add(res,tmp);
        }
        return res;
    }

    private static String add(String s1, String s2) {
        StringBuilder r = new StringBuilder();
        if ("0".equals(s1) || "".equals(s1)) return s2;
        if ("0".equals(s2) || "".equals(s2)) return s1;
        int i = s1.length();
        int j = s2.length();
        int isTen = 0;
        while (i != 0 && j != 0) {
            int tmp = s1.charAt(--i) - '0' + s2.charAt(--j) - '0' + isTen;
            if (tmp >= 10) {
                isTen = 1;
                tmp -= 10;
            }else {
                isTen = 0;
            }
            r.insert(0, tmp);
        }
        while (i != 0){
            int tmp = s1.charAt(--i) - '0' + isTen;
            if (tmp >= 10) {
                isTen = 1;
                tmp -= 10;
            }else {
                isTen = 0;
            }
            r.insert(0, tmp);
        }

        while (j != 0){
            int tmp = s2.charAt(--j) - '0' + isTen;
            if (tmp >= 10) {
                isTen = 1;
                tmp -= 10;
            }else {
                isTen = 0;
            }
            r.insert(0, tmp);
        }
        if (isTen == 1){
            r.insert(0,"1");
        }
        return r.toString();
    }
}
