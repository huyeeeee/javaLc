package org.leetcode.items._001_100;

/**
 * @Auther: hujiangping
 * @Date: 2023/5/5 20:52
 * @Description: _66_加一
 * @Version 1.0.0
 */
public class _66_加一 {
    public int[] plusOne(int[] digits) {
        if (digits[0] == 0) return new int[]{1};
        int isTen = 0;
        int tmp = 0;
        for(int i = digits.length - 1;i >= 0;i--){
            if(i == digits.length - 1) tmp = digits[i] + 1;
            else tmp = digits[i] + isTen;
            if(tmp >= 10){
                isTen = 1;
            }else{
                isTen = 0;
            }
            digits[i] = tmp % 10;
        }
        if(isTen == 0) return digits;
        int[] res = new int[digits.length + 1];
        for(int i = 0;i < digits.length;i++){
            res[i+1] = digits[i];
        }
        res[0] = 1;
        return res;
    }
}
