package org.leetcode.items._201_300;

/**
 * @Author: hujiangping
 * @Date: 2023/6/13 20:18
 * @Description: _278_第一个错误的版本
 * @Version 1.0.0
 */
public class _278_第一个错误的版本 {
    boolean isBadVersion(int version){
        return true;
    }
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while (l < n){

            if (l + 1 == r) {
                if (isBadVersion(l)) {
                    return l;
                } else {
                    return r;
                }
            }

            int mid = l + (r - l) / 2;
            if (isBadVersion(mid)){
                r = mid ;
            }else {
                l = mid;
            }
        }
        return l;
    }
}
