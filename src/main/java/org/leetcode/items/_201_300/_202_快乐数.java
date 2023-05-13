package org.leetcode.items._201_300;

/**
 * @Author: hujiangping
 * @Date: 2023/4/28 11:44
 * @Description: _202_快乐数
 * @Version 1.0.0
 */
public class _202_快乐数 {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = getNext(slow);
            fast = getNext(fast);
            fast = getNext(fast);
        }while(slow != fast);
        return slow == 1;
    }

    public int getNext(int n){
        int val = 0;
        int tmp = 0;
        while (n > 0){
            tmp = n % 10;
            n = n / 10;
            val += tmp *tmp;
        }
        return val;
    }
}
