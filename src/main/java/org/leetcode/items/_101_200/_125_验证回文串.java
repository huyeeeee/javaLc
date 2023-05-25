package org.leetcode.items._101_200;

/**
 * @Author: hujiangping
 * @Date: 2023/5/25 20:57
 * @Description: _125_验证回文串
 * @Version 1.0.0
 */
public class _125_验证回文串 {
    public boolean isPalindrome(String s) {
        if (s.length() < 2) return true;
        int l = 0;
        int r = s.length() - 1;
        while (l < r){
            char lc = s.charAt(l);
            if(!Character.isLetterOrDigit(lc)){
                l ++;
                continue;
            }
            char rc = s.charAt(r);
            if(!Character.isLetterOrDigit(rc)){
                r--;
                continue;
            }

            if (Character.isUpperCase(rc)) rc = Character.toLowerCase(rc);
            if (Character.isUpperCase(lc)) lc = Character.toLowerCase(lc);
            if(rc != lc){
                return false;
            }
            l += 1;
            r -= 1;
        }
        return true;
    }

}
