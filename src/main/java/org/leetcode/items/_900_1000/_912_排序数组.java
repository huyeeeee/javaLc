package org.leetcode.items._900_1000;

/**
 * @Auther: hujiangping
 * @Date: 2023/4/23 20:42
 * @Description: _912_排序数组
 * @Version 1.0.0
 */
public class _912_排序数组 {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length - 1);
        return nums;
    }

    private void quickSort(int[] n, int s,int e){
        if (s >= e) return;
        boolean isAllEqual = true;
        int first = n[s];
        for (int i = s; i <= e; i++) {
            if (first != n[i]) {
                isAllEqual = false;
                break;
            }
        }
        if (isAllEqual) return;
        int base = s;
        int i = s;
        int j = e;
        while (i != j){
            while (i < j && n[j] >= n[base]){
                j--;
            }
            while (i < j && n[i] <= n[base]){
                i++;
            }
            int t = n[i];
            n[i] = n[j];
            n[j] = t;
        }
        int t = n[base];
        n[base] = n[i];
        n[i] = t;
        quickSort(n,s,i-1);
        quickSort(n,i+1,e);
    }
}
