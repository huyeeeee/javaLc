package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/5/13 16:07
 * @Description: _29_两数相除
 * @Version 1.0.0
 */
public class _29_两数相除 {
    public static int divide(int d1, int d2) {
        boolean isPos = true;
        if((d1 > 0 && d2 > 0) || (d1 < 0 && d2 < 0)) isPos = true;
        else isPos = false;
        long d11 = Math.abs((long) d1);
        long d22 = Math.abs((long) d2);
        if (1 == d22) return isPos ? process(d11) : process(-d11);
        long res = 0;
        while(d11 >= d22){
            d11 -= d22;
            res += 1;
        }

        return isPos ? process(res) : process(-res);
    }

    private static int process(long l){
        if (l > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if (l < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) l;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
    }
}
